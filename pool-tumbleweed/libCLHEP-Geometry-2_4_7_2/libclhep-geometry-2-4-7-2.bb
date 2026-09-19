SUMMARY = "Shared library for CLHEP Geometry"
DESCRIPTION = "This package provides the CLHEP Geometry shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-Geometry-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "583810edfe62dfefc4ae26bb4e2f948d0dc361c4f3269b1ab9dc903efad4d4066c69180ca9b21eea104cf4349c718d3bd5fa6f5e6b633dcdaab071b3557c2dac"

RPROVIDES:${PN} += "libCLHEP-Geometry-2-4-7-2 \
libCLHEP-Geometry-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
