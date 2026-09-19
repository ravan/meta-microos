SUMMARY = "Developer documentation for sdbus-cpp"
DESCRIPTION = "READMEs and generated doxygen documentation for sdbus-cpp"
LICENSE = "LGPL-2.1-only"

PV = "2.3.1"

RPM_NAME = "sdbus-cpp-devel-doc-2.3.1-1.3.noarch.rpm"
RPM_HASH = "aa116c16eb61167c749b5cbbbfa9a04387a5df38499e3af6fff5c4de81cdd388010b4418948e8cb6a865eefcc520072c3d2e9f49d0dfa35aed095fdc4ef352e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbus-cpp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
