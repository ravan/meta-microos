SUMMARY = "Zabbix web frontend (php)"
DESCRIPTION = "The Zabbix PHP frontend allows access via standard web browsers. \
 \
NOTE: You still have to install the PHP package which contains your db driver!"
LICENSE = "Apache-2.0 & GPL-2.0-or-later & EPL-2.0 & MPL-2.0 & BSD-3-Clause"

PV = "7.0.28"

RPM_NAME = "zabbix-ui-7.0.28-1.2.noarch.rpm"
RPM_HASH = "49dfc6a154d329095987b0e4a2185e07b8c967e7a638f19cbd665f53b29c47a5c4400d52c626b76a1cd598e771e4b9eef837e28766a112f6ab890b6a9736d496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-zabbix-ui \
zabbix-phpfrontend \
zabbix-ui"

RDEPENDS:${PN} += "/usr/bin/bash \
apache2 \
php8 \
php8-bcmath \
php8-ctype \
php8-gd \
php8-gettext \
php8-ldap \
php8-mbstring \
php8-sockets \
php8-xmlreader \
php8-xmlwriter"

inherit rpm
