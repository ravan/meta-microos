SUMMARY = "PDF documentation for the Boost C++ Libraries"
DESCRIPTION = "This package contains the documentation of the boost dynamic libraries \
in PDF format."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "boost1_91_0-doc-pdf-1.91.0-4.1.noarch.rpm"
RPM_HASH = "dcbd8c9c462fb1e5dd4d87032703d8d3574d26e0cc196012c31fb8c2c29fec8c1a1852a654b725fa2b8d93a2830859042b5857db697812224119df3f766254d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost1-91-0-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
