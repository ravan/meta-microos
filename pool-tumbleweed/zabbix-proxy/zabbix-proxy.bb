SUMMARY = "System files for the Zabbix proxy"
DESCRIPTION = "The Zabbix proxy component."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-proxy-7.0.28-1.2.aarch64.rpm"
RPM_HASH = "cc8adcd7fb47e2d1fcea183f39b2bd04839842ef1e02123e97952d49188d87de96fb9123c302ee62955cd6f4bbe41b03c08ae346a2b1a1c307e383c5c7bce289"

RPROVIDES:${PN} += "config-zabbix-proxy \
zabbix-proxy"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
fping \
group-zabbixs \
logrotate \
shadow \
update-alternatives \
user-zabbixs \
zabbix-proxy-binary"

inherit rpm
