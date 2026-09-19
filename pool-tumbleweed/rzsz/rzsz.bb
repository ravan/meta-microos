SUMMARY = "X-, Y-, and Z-Modem Data Transfer Protocols"
DESCRIPTION = "rzsz allows you to use 'sz filename' to send a file to your local \
system."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.21~rc"

RPM_NAME = "rzsz-0.12.21~rc-9.3.aarch64.rpm"
RPM_HASH = "724d84b17cffb0848d09669552b962d714adc0546b9f28bc7659c63f3f8644c240c91275b7d12f8847e863d363c442e24b5a1b54bfbf3f6abedcf1aed8ea292d"

RPROVIDES:${PN} += "lrzsz \
rzsz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
