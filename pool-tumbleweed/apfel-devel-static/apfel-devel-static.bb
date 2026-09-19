SUMMARY = "Static development files for Apfel, a PDF Evolution library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions. \
 \
This package provides the static library required to develop \
applications with apfel."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "apfel-devel-static-3.1.1-2.15.aarch64.rpm"
RPM_HASH = "7fdaad367d7836f0cd410ae956e43f9f72f64e1237b35820d7348141ba64b8d60704da6aa66c43e1c4e81ce23071528561bcf6a5b965615a904b7d71496cbff1"

RPROVIDES:${PN} += "apfel-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
