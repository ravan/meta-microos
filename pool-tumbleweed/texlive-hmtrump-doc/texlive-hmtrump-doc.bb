SUMMARY = "Documentation for texlive-hmtrump"
DESCRIPTION = "This package includes the documentation for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-doc-2026.226.1.2asvn54512-60.4.noarch.rpm"
RPM_HASH = "66d410323b1614bfa720f3e89dd34aad23f7ffed1ef85d3657948ea035b440f5635d8c78ed6be8cbf4e22e4837f2cd4d9f3c8d8a3aeeb1173c53cb1f82c35d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hmtrump-doc-ja \
texlive-hmtrump-doc"

RDEPENDS:${PN} += ""

inherit rpm
