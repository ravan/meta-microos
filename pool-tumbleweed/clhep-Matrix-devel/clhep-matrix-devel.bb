SUMMARY = "Headers and sources for development with CLHEP Matrix library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP Matrix library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Matrix-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "4bc5a0cead4b7be1fc981ec608dcb22dc20fbb7e3297e81dc445975f70d18233b0ccdf2e7ca9a839cd77114f355a4d65c73fda08dfd98e0496a784c4a5144d59"

RPROVIDES:${PN} += "clhep-Matrix-devel \
pkgconfig-clhep-matrix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
clhep-Units-devel \
clhep-Utility-devel \
libCLHEP-Matrix-2-4-7-2 \
pkgconfig-clhep-random \
pkgconfig-clhep-vector"

inherit rpm
