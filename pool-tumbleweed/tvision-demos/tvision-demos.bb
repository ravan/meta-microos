SUMMARY = "Demo programs of Turbo Vision 2.0"
DESCRIPTION = "This package contains demo programs showing off the \
modernised Turbo Vision 2.0 port. \
 \
A modern port of Turbo Vision 2.0, the classical \
framework for text-based user interfaces, but \
with Unicode and cross-platform support."
LICENSE = "MIT"

PV = "0~git727"

RPM_NAME = "tvision-demos-0~git727-1.5.aarch64.rpm"
RPM_HASH = "c4a511b912f357dd3300e7f5b3b2c15380c8562f626c04d64b2600ecbaf053ad4405feb95d1ee0b5a6835a06a16409fd01ca44bdb5c91a206f29d801dc2b300d"

RPROVIDES:${PN} += "tvision-demos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
