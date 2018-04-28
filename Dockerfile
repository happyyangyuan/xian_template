FROM anapsix/alpine-java:8_server-jre_unlimited
RUN mkdir -p /data/workspace
COPY xian_runtime /data/workspace/xian_runtime

ENV XIAN_ENV dockerTest

#CMD命令内支持加入环境变量
CMD ["java","-Xms64m", "-Xmx320m", "-XX:-OmitStackTraceInFastThrow", "-cp", "conf:plugins/*:../libs/*", "info.xiancloud.core.init.start.StartServer"]

