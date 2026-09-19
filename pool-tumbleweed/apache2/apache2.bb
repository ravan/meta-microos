SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.67"

RPM_NAME = "apache2-2.4.67-1.3.aarch64.rpm"
RPM_HASH = "59727ae50ec6752c474e5cd8b9baaf90e8a2873c3b8fa4827941479649fe7dce00450c329905d7e4128b29e30c5f0f6c061f57e142cc76c04f14a69e1147d942"

RPROVIDES:${PN} += "apache-mmn-20120211 \
apache2 \
config-apache2 \
http-daemon \
httpd \
suse-maintenance-mmn-0"

RDEPENDS:${PN} += "/etc/mime.types \
/usr/bin/bash \
/usr/bin/sh \
apache2-MPM \
group-www \
ld-linux-aarch64.so.1 \
libc.so.6 \
logrotate \
user-wwwrun"

inherit rpm
