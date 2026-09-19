SUMMARY = "Zabbix server with PostgreSQL support"
DESCRIPTION = "The Zabbix server compiled with PostgreSQL support."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-server-postgresql-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "c9eea293401bcd8c3009c628f836c0c2640d6bd5fa4c1079d843b954fb68939ced760ebf9331a6d6149a7fc51d207a665b4e143779fbc59c4077e33c023ca5ed"

RPROVIDES:${PN} += "zabbix \
zabbix-server-binary \
zabbix-server-postgresql"

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
zabbix-server"

inherit rpm
