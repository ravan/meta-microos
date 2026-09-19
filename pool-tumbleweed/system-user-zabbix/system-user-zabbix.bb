SUMMARY = "Users and groups"
DESCRIPTION = "Zabbix users and groups required by zabbix packages"
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "system-user-zabbix-7.0.28-1.2.noarch.rpm"
RPM_HASH = "8bb1457580da75c53bbaf88525679c1a874727b2a2464d28773cfdef90337b8cad269ea5a2fa64fbaf02410f4980f8338e7b886ef85358575e18b144524762ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-zabbix \
group-zabbixs \
system-user-zabbix \
user-zabbix \
user-zabbixs"

RDEPENDS:${PN} += "/usr/bin/sh \
pwdutils"

inherit rpm
