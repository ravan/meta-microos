SUMMARY = "Zabbix proxy with SQLite support"
DESCRIPTION = "The Zabbix proxy compiled with SQLite support."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-proxy-sqlite-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "f80bdff8ccc5e1662997f2a4e10d80289f2cc97089714fa5ee0e385e606211e0d6fd41fe4eaff8216794c81e82df0d6c44a0a11d4cc880cf610f0547fdd15b11"

RPROVIDES:${PN} += "zabbix \
zabbix-proxy-binary \
zabbix-proxy-sqlite"

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
libsqlite3.so.0 \
libssh2.so.1 \
libssl.so.3 \
libxml2.so.16 \
libz.so.1 \
update-alternatives \
zabbix-proxy"

inherit rpm
