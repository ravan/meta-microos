SUMMARY = "Library of free natural language processing tools"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains the files needed to build or develop applications \
that use Voikko."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.3"

RPM_NAME = "libvoikko-devel-4.3.3-1.5.aarch64.rpm"
RPM_HASH = "41d337379353e543425a2094f6d928c6cb33cd690d6a54144fb3afaa7c22aa399d3de2743e0cbd86af521c3a0bff08b085a622118359c1b34456d19d04b0c72b"

RPROVIDES:${PN} += "libvoikko-devel \
pkgconfig-libvoikko"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libvoikko1"

inherit rpm
