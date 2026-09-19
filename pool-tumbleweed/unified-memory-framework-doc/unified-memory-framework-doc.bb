SUMMARY = "Documentation for unified-memory-framework"
DESCRIPTION = "The Unified Memory Framework (UMF) is a library for constructing allocators \
and memory pools. \
 \
This package contains the documentation for UMF."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "unified-memory-framework-doc-0.11.0-1.5.noarch.rpm"
RPM_HASH = "1226fcc4fbccde6e4efeeb431ec247e82d4a64135240d6a6479e962d7de9248d62ec767cf403b28f6f044a15337b768bdec83ceb36b68da1b208cfb45c098a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unified-memory-framework-doc"

RDEPENDS:${PN} += ""

inherit rpm
