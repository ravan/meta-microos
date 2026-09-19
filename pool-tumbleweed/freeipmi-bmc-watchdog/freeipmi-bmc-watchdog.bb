SUMMARY = "FreeIPMI BMC watchdog"
DESCRIPTION = "Provides a watchdog daemon for OS monitoring and recovery."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "freeipmi-bmc-watchdog-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "d84a4aff1b0206fd558cae2e8093afec4595782aae2b1cc8208b7834fbdb2e2127ce891ddd0f875e6ac45ac393a4ada83c20fc486f943260a6b8fbcdb28040e6"

RPROVIDES:${PN} += "freeipmi-bmc-watchdog"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
freeipmi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
logrotate \
systemd"

inherit rpm
