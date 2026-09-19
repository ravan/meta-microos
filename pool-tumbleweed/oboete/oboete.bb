SUMMARY = "A simple flashcards application for the COSMIC desktop"
DESCRIPTION = "A simple flashcards application for the COSMIC desktop. Written in Rust."
LICENSE = "GPL-3.0-only"

PV = "0.2.6"

RPM_NAME = "oboete-0.2.6-1.2.aarch64.rpm"
RPM_HASH = "bf464b09bb2cb835b53bf0555594ddf7a66bf2618c17c16a55fdc8d48a088c2bdb7e1d0b10cf42d6e39c1b5ed24cb616dff4764d753b03b78d5dd04bfcc22c53"

RPROVIDES:${PN} += "oboete"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
