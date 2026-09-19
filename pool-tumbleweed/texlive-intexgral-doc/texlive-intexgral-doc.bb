SUMMARY = "Documentation for texlive-intexgral"
DESCRIPTION = "This package includes the documentation for texlive-intexgral"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.1svn77252"

RPM_NAME = "texlive-intexgral-doc-2026.226.3.0.1svn77252-60.2.noarch.rpm"
RPM_HASH = "0d5f5cc4ec9d3fc1c077b10234f73f4989f75dcee57d82d513f5d6a4576d46e9eb5f9faa04348b60ea24d867d92c1929e0a0538bf8d7654619f7e7bbd3bb1e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-intexgral-doc-fr \
texlive-intexgral-doc"

RDEPENDS:${PN} += ""

inherit rpm
