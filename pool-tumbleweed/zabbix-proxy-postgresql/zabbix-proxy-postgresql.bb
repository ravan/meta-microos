SUMMARY = "Zabbix proxy with PostgreSQL support"
DESCRIPTION = "The Zabbix proxy compiled with PostgreSQL support."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-proxy-postgresql-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "5209a5bdb996f6fa1fd5ea76555aba9e1e18e5027b5fe3f156ad6ce0ee977583aa69bdadc872d50bf3d38016fdb40fcd73977aeab63a0245198506dbc08d64e3"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-binary \
zabbix-proxy-postgresql"

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
libnetsnmp.so.45 \
libodbc.so.2 \
libpcre2-8.so.0 \
libpq.so.5 \
libssh2.so.1 \
libssl.so.3 \
libxml2.so.16 \
libz.so.1 \
postgresql \
update-alternatives \
zabbix-proxy"

inherit rpm
