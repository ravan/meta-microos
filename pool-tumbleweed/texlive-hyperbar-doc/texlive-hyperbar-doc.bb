SUMMARY = "Documentation for texlive-hyperbar"
DESCRIPTION = "This package includes the documentation for texlive-hyperbar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn48147"

RPM_NAME = "texlive-hyperbar-doc-2026.226.0.0.1svn48147-60.2.noarch.rpm"
RPM_HASH = "ea18a9431485b4958c0e8e8eee37299e61fe9fe7e72c22f27d863268e2e6f0fe4c31c53d7fdec709d669f7beb87c54c112f57c65698a40305b9e83dc4bf8eaf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyperbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
