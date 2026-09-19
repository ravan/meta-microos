SUMMARY = "The kernel log daemon"
DESCRIPTION = "The klogd daemon 'listens' to kernel log messages, prioritizes them, \
and routes them to either output files or to syslog daemon. \
 \
This version of klogd will optionally translate kernel addresses to \
their symbolic equivalents if provided with a system map."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "klogd-1.5.1-808.4.aarch64.rpm"
RPM_HASH = "6e716283acd1ad1ea5a054996c6c31ebfbbf9948a0df968e5bad161a487987b7e6e0b81ed2730945a5b791a30eb7d69fbd87379ad42c782624e4c3fb0cacc245"

RPROVIDES:${PN} += "klogd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
