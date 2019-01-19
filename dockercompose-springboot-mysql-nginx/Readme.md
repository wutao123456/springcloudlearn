直接将代码copy到服务器 docker-compose up
1.第一次运行会从maven中央仓库下载一堆东西，会比较慢

2.nginx启动会报错
nginx: [emerg] host not found in upstream "app" in /etc/nginx/conf.d/app.conf:7
可以不予理会,服务启动后可直接通过IP访问

3.ubuntu 设置dns 需在/etc/systemd/resolved.conf 中设置
可通过/etc/resolv.conf 注释了解到