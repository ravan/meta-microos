SUMMARY = "Check disk space"
DESCRIPTION = "This plugin checks the amount of used disk space on a mounted file system and \
generates an alert if free space is less than one of the threshold values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-disk-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "fd42965eec3161d8dcc4ddc5e7b79bdf514553a3bf736bcb616c5ae96ab44e991eedc524ae991c25d57a426ba1f8f438216985b06fdd70cd06d544270e3db7ec"

RPROVIDES:${PN} += "config-monitoring-plugins-disk \
monitoring-plugins-disk \
nagios-plugins-disk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
