SUMMARY = "Libraries and header files for the vectorscan library"
DESCRIPTION = "A fork of Intel's Hyperscan, modified to run on more platforms. \
 \
This package provides the libraries, include files and other resources \
needed for developing Hyperscan applications."
LICENSE = "BSD-3-Clause"

PV = "5.4.12"

RPM_NAME = "vectorscan-devel-5.4.12-1.4.aarch64.rpm"
RPM_HASH = "5a3cc1794d6c98b4e010b11ce4bb04f593df2eaa9d0be6d7592c3bd2c78f039a69c251527c33e842ae0d94be62101da453508af315227bfb207a36c6b2c049f4"

RPROVIDES:${PN} += "pkgconfig-libhs \
vectorscan-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhs5-vectorscan5"

inherit rpm
