SUMMARY = "Bitlbee plugin for Discord"
DESCRIPTION = "Bitlbee plugin for Discord."
LICENSE = "GPL-2.0-only"

PV = "0.4.3+7.g607f988"

RPM_NAME = "bitlbee-discord-0.4.3+7.g607f988-1.18.aarch64.rpm"
RPM_HASH = "14e720310161a31560ce0b6fd75ccb7afd51a31a2862d31f2e6c613edcb70eaf5cecb628a4710992fdaa85f5fc9964d2c3f0c5be17c5b2eace5abce68a30d79d"

RPROVIDES:${PN} += "bitlbee-discord"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
