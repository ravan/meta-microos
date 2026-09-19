SUMMARY = "Development files for argtable3"
DESCRIPTION = "A single-file, ANSI C, command-line parsing library that parses GNU-style \
command-line options. \
 \
This package contains the files needed to build using argtable3."
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "argtable3-devel-3.3.1-1.1.aarch64.rpm"
RPM_HASH = "93e9763258d1d2caf232f5ff42192287bad1a41adbc595954b5e347e470b56ffcff87149c291f314fca678f27d5c92f00ce6c0db47e8585f2334a1c9a79eb5b9"

RPROVIDES:${PN} += "argtable3-devel \
cmake-Argtable3 \
pkgconfig-argtable3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libargtable3-3"

inherit rpm
