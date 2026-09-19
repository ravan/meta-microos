SUMMARY = "The Blitz html docs"
DESCRIPTION = "Blitz++ is a C++ class library for scientific computing which provides \
performance on par with Fortran 77/90. It uses template techniques to achieve \
high performance. Blitz++ provides dense arrays and vectors, random number \
generators, and small vectors. \
 \
This package provides documentation files for the Blitz Library."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "blitz-doc-1.0.2-2.25.noarch.rpm"
RPM_HASH = "45941ebb0b104443e8ff9b005f60f945913ef53874c95725acd827d5a7f0d5216f38cb5dab8a7dd9ad30abcca656677de420243e4c7d0ac6e6cb5ca3b5b428fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blitz-doc"

RDEPENDS:${PN} += ""

inherit rpm
