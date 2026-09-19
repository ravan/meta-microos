SUMMARY = "Software for reading and writing Data Matrix barcodes"
DESCRIPTION = "libdmtx is open source software for reading and writing Data Matrix barcodes. \
At its core libdmtx is a native shared library, allowing C/C++ programs to use \
its capabilities without extra restrictions or overhead."
LICENSE = "BSD-2-Clause"

PV = "0.7.8"

RPM_NAME = "libdmtx-devel-0.7.8-1.5.aarch64.rpm"
RPM_HASH = "2432af7be04ff850c6fa63aae87cbf0b6acd8a2f17a2ab90f472dbb8215c95669ecf4302b168f4f39dff380a074c9a868748cf188184464b445539fbb346217f"

RPROVIDES:${PN} += "libdmtx-devel \
pkgconfig-libdmtx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmtx0"

inherit rpm
