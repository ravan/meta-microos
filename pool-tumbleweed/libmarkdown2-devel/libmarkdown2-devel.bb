SUMMARY = "Headers and sources for developing apps against discount markdown 2.x"
DESCRIPTION = "Discount is a C language implementation of the Markdown markup language. \
 \
This package provides the headers and sources needed to develop apps against \
libmarkdown 2.x."
LICENSE = "BSD-3-Clause"

PV = "2.2.7d"

RPM_NAME = "libmarkdown2-devel-2.2.7d-2.9.aarch64.rpm"
RPM_HASH = "69bd9dee033550a8ed92d31f81dc863b1b9fc13451bb3f6297a15c98c969750f398c81e6db59d57d053ac462d3dcbe5f90ba03a53919e920d1d4befc43584a27"

RPROVIDES:${PN} += "libmarkdown2-devel \
pkgconfig-libmarkdown"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmarkdown2"

inherit rpm
