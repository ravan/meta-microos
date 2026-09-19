SUMMARY = "System files for the Zabbix server"
DESCRIPTION = "The Zabbix server component."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-server-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "06a65fcdf6fab30c4972e39ff09815afa3432d4668fe4ce97eb242a4ecd936e269847b0720d3814f056f9876287a923a335040675f7e57bf14f075f666095a8a"

RPROVIDES:${PN} += "config-zabbix-server \
zabbix-server"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
fping \
group-zabbixs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libm.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libxml2.so.16 \
libz.so.1 \
logrotate \
shadow \
update-alternatives \
user-zabbixs \
zabbix-server-binary"

inherit rpm
