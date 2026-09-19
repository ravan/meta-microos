SUMMARY = "Local resource monitor agent for Zabbix"
DESCRIPTION = "The Zabbix agent monitors local resources and relays information to the server."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-agent-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "1691eb4579b9d2d7da214d981b2febeb78277b1347d2b8163e7be7c7e3d0950160ea6a63e7df6ec535d9113bf996516a61aeaa2a074cfaa152d02ad738735c7e"

RPROVIDES:${PN} += "config-zabbix-agent \
zabbix-agent"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-zabbix \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libz.so.1 \
logrotate \
shadow \
update-alternatives \
user-zabbix"

inherit rpm
