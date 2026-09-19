SUMMARY = "The GiNaC tutorial in PDF format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides a tutorial file for GiNaC in PDF format."
LICENSE = "GPL-2.0-only"

PV = "1.8.10"

RPM_NAME = "ginac-doc-tutorial-1.8.10-1.4.noarch.rpm"
RPM_HASH = "a4607b77dda9af0504ec3dda9b611b0f3b494eae64490d41a9c2eedafab23f613f97c4c2f5785d5d919435144e61eb470f82f69c75b2a78da2615259404b5ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-tutorial"

RDEPENDS:${PN} += ""

inherit rpm
