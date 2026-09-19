SUMMARY = "Provide the /proc based uptime"
DESCRIPTION = "Simply provide the /proc based uptime command."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.7"

RPM_NAME = "procps-uptime-4.0.7-2.1.aarch64.rpm"
RPM_HASH = "36b8ea28ed586ef087e20970b2255fc0304c8479874ef0563adfa200cb8c9d65ffcf80fb61bc1be4c16f6cc85c776dd67da2b2c4bc8129b9060c236b4ac8c5cb"

RPROVIDES:${PN} += "procps-/usr/bin/uptime \
procps-uptime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libproc2.so.1"

inherit rpm
