import { useState, useEffect } from 'react'
import './App.css';
import { getAllShows} from "./client";
import { Layout, Menu, Breadcrumb, Table, Spin, Empty, Tag } from 'antd';
import {
    LoadingOutlined
} from '@ant-design/icons';

import logo from './hbo-max-h-w-l.svg';

const { Header, Content, Footer } = Layout;

const columns = [
    {
        title: 'Name',
        dataIndex: 'name',
        key: 'name',
        render: text => <a>{text}</a>
    },
    {
        title: 'Date',
        dataIndex: 'date',
        key: 'date',
    },
    {
        title: 'Rating',
        dataIndex: 'rating',
        key: 'rating',
        render: rating => {var color;
            if(rating === 'G')
                color = 'blue'
            if(rating === 'PG')
                color = 'cyan'
            if(rating === 'PG-13')
                color = 'green'
            if(rating === 'R')
                color = 'orange'
            if(rating === 'NC-17')
                color = 'red'

        return <Tag color={color} key={rating}>
            {rating}
        </Tag>}
    },
    {
        title: 'Genre',
        dataIndex: 'genre',
        key: 'genre',
    },
    {
        title: 'Trailer',
        dataIndex: 'trailer',
        key: 'trailer',
        render: trailer => <a href={trailer} target="_blank">Watch</a>
    },
];

const antIcon = <LoadingOutlined style={{ fontSize: 24 }} spin />;

function App() {
  const [shows, setShows] = useState([]);
  const [fetching, setFetching] = useState(true);

  const fetchShows = () =>
      getAllShows()
          .then(res => res.json())
          .then(data => {
            console.log(data);
            setShows(data);
            setFetching(false);
          })

  useEffect(() => {
    console.log("component is mounted")
    fetchShows();
  }, []);

    const renderShows = () => {
        if(fetching) {
            return <Spin indicator={antIcon} />
        }
        if(shows.length <= 0) {
            return <Empty />;
        }
        return <Table dataSource={shows} columns={columns}
                      bordered
                      title={() => 'Upcoming Shows'}
                      pagination={{ pageSize: 20 }} scroll={{ y: 240 }}
                      rowKey={(show) => show.id}/>;
    }

  return <Layout className="layout">
      <Header>
      <div className="header">
          <img src="https://www.hbomax.com/img/hbo-max-h-w-l.svg" alt="logo"/>
      </div>
      </Header>

      <Content style={{ padding: '0 50px' }}>
          <Breadcrumb style={{ margin: '16px 0' }}>

          </Breadcrumb>
          <div className="site-layout-content">
              {renderShows()}
          </div>
      </Content>
      <Footer style={{ textAlign: 'center' }}>HBO Max ©2021</Footer>
  </Layout>
}

export default App;

