SUMMARY = "Development files to build modules for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the development headers for developing modules for ZNC."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "znc-devel-1.10.3-1.1.aarch64.rpm"
RPM_HASH = "8e7b585d5309b46213cfd6bb180845a6c5a5389781d7ccd3088c46ab18bdf2752559a0933f0652e61ff1f8fead3d45216aa645020323ccfa447767cfe3c109b9"

RPROVIDES:${PN} += "pkgconfig-znc \
znc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
znc"

inherit rpm
