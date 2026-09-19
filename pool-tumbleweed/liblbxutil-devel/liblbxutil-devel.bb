SUMMARY = "Development files for the Low Bandwith X extension routines"
DESCRIPTION = "liblbxutil is a library of routines for LBX (Low Bandwidth X) \
extension support shared between the lbxproxy program and an \
LBX-supporting X server. \
 \
This package contains the development headers for the library found \
in liblbxutil1."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "liblbxutil-devel-1.1.0-14.9.aarch64.rpm"
RPM_HASH = "1806fa6a4d65732bdca0ab3a26dffd929c1edc6c5aceb0f5558ad67d01201e693fe0d3b37b969a661a612e5ad3e791a96a4a045afd2bf470ef6b3612963696c8"

RPROVIDES:${PN} += "liblbxutil-devel \
pkgconfig-lbxutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblbxutil1"

inherit rpm
