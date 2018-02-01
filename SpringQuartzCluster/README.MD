# Quartz集群配置

- 官网找对硬版本quartz，下载导入十一张数据库表。
- 集群配置，每次只有一台机器执行定时任务
- 多台集群执行任务一直在一台机器上

- 配置中遇到Unable to serialize JobDataMap for insertion into database问题，后取消对ApplicationContext的配置解决问题

