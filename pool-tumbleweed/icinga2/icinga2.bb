SUMMARY = "Network monitoring application"
DESCRIPTION = "Meta package for Icinga 2 Core, DB IDO and Web."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.5"

RPM_NAME = "icinga2-2.16.5-1.2.aarch64.rpm"
RPM_HASH = "47f52092cbe286f2fe055a7182f1539eaf54afdc9ea586358056589bf6a957096dc8a536c570298a060706ce10f9a80a7b3add70919425d0c5ce761a259a98dd"

RPROVIDES:${PN} += "config-icinga2 \
icinga2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
group-icinga \
group-icingacmd \
icinga2-bin \
icinga2-common \
permissions \
user-icinga"

inherit rpm
