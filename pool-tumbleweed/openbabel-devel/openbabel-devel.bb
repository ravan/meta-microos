SUMMARY = "Development files for Open Babel"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas."
LICENSE = "GPL-2.0-only"

PV = "3.2.1"

RPM_NAME = "openbabel-devel-3.2.1-1.1.aarch64.rpm"
RPM_HASH = "6f5c2a9cd22c4ddaf665c7955e7e2d7da46b189a954bb55c90dec9d97df34db1e1a3b79f1c8473c3ed6a4134f69bb99279d2beb1f22166e60e19bc527c400946"

RPROVIDES:${PN} += "cmake-OpenBabel3 \
libopenbabel-devel \
openbabel-devel \
pkgconfig-openbabel-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenbabel8 \
pkgconfig-zlib"

inherit rpm
