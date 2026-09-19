SUMMARY = "Zabbix proxy with MySQL support"
DESCRIPTION = "The Zabbix proxy compiled with MySQL support."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-proxy-mysql-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "c40163d35dd2d4d6ab59913faa97e894dc43694abde012e75bd63bb4f5b31a396fccb9e42d6155a81ad946acdf3821889a1b57960ceecebef29209d5671f8e36"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-binary \
zabbix-proxy-mysql"

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
zabbix-proxy"

inherit rpm
