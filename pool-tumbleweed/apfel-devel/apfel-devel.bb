SUMMARY = "Development files for Apfel, a PDF Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions. \
 \
This package provides the source files required to develop \
applications with apfel."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "apfel-devel-3.1.1-2.15.aarch64.rpm"
RPM_HASH = "c2920987acfda9808f9448da17f807d8f6e37abb13fc91cbbff0195e130759d0ea4e15ac2f310876546c90a8a41a9cb3ef8582daaffec795a06928fc222538f2"

RPROVIDES:${PN} += "apfel-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
LHAPDF-devel \
libAPFEL0-0-0"

inherit rpm
