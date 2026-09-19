SUMMARY = "Check the time on the specified host"
DESCRIPTION = "This plugin will check the time on the specified host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-time-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "d00d656a536859dc6080ebb3566cf3632eb9dbff11da52d12835c8fb4c8c4f7febae708c3901bffe75a5ee61c3546d314af397fdc9bd2e7092e47da0a52e7c83"

RPROVIDES:${PN} += "monitoring-plugins-time \
nagios-plugins-time"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
