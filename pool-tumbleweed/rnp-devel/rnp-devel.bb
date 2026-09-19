SUMMARY = "Development files for RNP"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG. \
This package contains the files needed to build against librnp."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.18.1"

RPM_NAME = "rnp-devel-0.18.1-5.1.aarch64.rpm"
RPM_HASH = "22330e75ce6abf45a7a27f5da36dd76b17e0b9ca7f89003604c5e0cbdc917ed86d928877d32f6e98ea774e03c62a2b082e9c8aafe95ee8d384265be2d3cb2367"

RPROVIDES:${PN} += "cmake-rnp \
pkgconfig-librnp \
rnp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librnp0"

inherit rpm
