SUMMARY = "2048 application for the Cosmic desktop"
DESCRIPTION = "A 2048 game written in libcosmic and Rust."
LICENSE = "GPL-3.0-only"

PV = "0.1.0+git20240802.b8c9457"

RPM_NAME = "cosmic-ext-2048-0.1.0+git20240802.b8c9457-1.13.aarch64.rpm"
RPM_HASH = "1bc5f2bc6900714061e198400b6eb05f907b6abababb81b81cc6c6749ff94f97d345356c97f7fbf9bd8431499bbd78ef290567b6a77bcf109f2d2fa0be6905ca"

RPROVIDES:${PN} += "cosmic-ext-2048"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
