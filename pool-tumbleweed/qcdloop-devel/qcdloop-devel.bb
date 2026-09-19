SUMMARY = "Development headers and sources for QCDLoop"
DESCRIPTION = "QCDLoop is a library of one-loop scalar Feynman integrals, evaluated close to \
four dimensions. This package provides headers and sources for QCDLoop needed \
for developing software against QCDLoop."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "qcdloop-devel-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "73774cd3ffc63248caf610939b9d96cbc1681f2b2ba2c3291447cd53bf3c0caba49f40a38d45a813ee8a2ebb3c572f74a8a9fe0b3011790dafddd7d7349320d0"

RPROVIDES:${PN} += "pkgconfig-qcdloop \
qcdloop-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
libqcdloop2"

inherit rpm
