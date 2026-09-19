SUMMARY = "SID chip music module player"
DESCRIPTION = "A player for playing SID music modules originally created on the Commodore 64 \
and compatibles."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "sidplayfp-3.2.0-1.1.aarch64.rpm"
RPM_HASH = "d29080a878af17293d0fb72f954d87b8c77fccf9fe3e62b91864cb571ca01b02fe8307986cd0baa4fadaab94b033ecc4ba7f21cdf0ae40b26a8da55c4de59f86"

RPROVIDES:${PN} += "bundled-ghc-filesystem \
bundled-miniaudio \
sidplayfp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsidplayfp.so.7 \
libstdc++.so.6 \
libstilview.so.0"

inherit rpm
