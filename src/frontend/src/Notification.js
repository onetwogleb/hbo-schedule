import {notification} from "antd";

const openNotificationWithIcon = (type, message, description, placement) => {
    placement = placement || "topRight"
    notification[type]({message, description, placement});
}

export const errorNotification = (message, description, placement) =>
    openNotificationWithIcon('error', message, description, placement);