SUMMARY = "Zabbix server with MySQL support"
DESCRIPTION = "The Zabbix server compiled with MySQL support."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-server-mysql-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "b21fd78a17cd766a5341d9d667001ea7487bbc7dde8c0ae3d089e272706d148042c331682413f248063cf9e0b154a49d8416e94ea6c38a69181096120ead2aa3"

RPROVIDES:${PN} += "zabbix \
zabbix-server-binary \
zabbix-server-mysql"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIposix.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libmariadb.so.3 \
libnetsnmp.so.45 \
libodbc.so.2 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libxml2.so.16 \
libz.so.1 \
mariadb \
update-alternatives \
zabbix-server"

inherit rpm
