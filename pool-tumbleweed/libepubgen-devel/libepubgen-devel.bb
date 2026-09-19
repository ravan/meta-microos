SUMMARY = "Development files for libepubgen"
DESCRIPTION = "libepubgen is a library for generating EPUB documents. It is directly \
pluggable into import filters based on librevenge. \
 \
This package contains the libepubgen development files."
LICENSE = "MPL-2.0"

PV = "0.1.1"

RPM_NAME = "libepubgen-devel-0.1.1-1.32.aarch64.rpm"
RPM_HASH = "5fa7ec00913fc59152ef7ed9cb9f724fe21ce607cc8dd72fddd7db96f29719c6fe0cfabc965b1c926a89ba47f74d1ab632d70680aced0dd3299a6460de0a0c07"

RPROVIDES:${PN} += "libepubgen-devel \
pkgconfig-libepubgen-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libepubgen-0-1-1 \
pkgconfig-librevenge-0.0"

inherit rpm
