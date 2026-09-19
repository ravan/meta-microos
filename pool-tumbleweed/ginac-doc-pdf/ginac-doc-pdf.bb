SUMMARY = "API documentation for GiNaC in PDF format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides the API documentation for GiNaC in PDF format."
LICENSE = "GPL-2.0-only"

PV = "1.8.10"

RPM_NAME = "ginac-doc-pdf-1.8.10-1.4.noarch.rpm"
RPM_HASH = "e4c06958c3f1ba207f5946b671789ff75d3e2a3c6f172eabc0451133c4bc7d91644a5728f66ff2e69d3a56c7eef876215764bcaf5ab459ab0d05e14ed4bd9905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
