SUMMARY = "Development package for SpeeX"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
SpeeX library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "speex-devel-1.2.1-2.10.aarch64.rpm"
RPM_HASH = "e3d7717fb210ccdbf64cd6f308c9bd4372e3329c78115a9b58c4fba423002b579478e1f6a07fdda1521daa3d90366390d53a4ce69e4a338a1c9e993c550a22a7"

RPROVIDES:${PN} += "libspeex-devel \
pkgconfig-speex \
speex-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeex1 \
speexdsp-devel"

inherit rpm
