SUMMARY = "Development package for the MUSCLE project SmartCards library"
DESCRIPTION = "This package contains the development files for pcsc-lite. It allows to \
compile plugins for the pcsc-lite package."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "2.3.3"

RPM_NAME = "pcsc-lite-devel-2.3.3-2.4.aarch64.rpm"
RPM_HASH = "1437b1e4abf335011956111690b43d55db3580d10b07159ed0cb0ce3e04da6d5939c70d2bb31e54fa331d8cb97120413a31d4543d363948384d124441f9ab6da"

RPROVIDES:${PN} += "pcsc-lite-devel \
pkgconfig-libpcsclite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
glibc-devel \
libpcsclite1 \
libpcscspy0 \
pcsc-lite"

inherit rpm
