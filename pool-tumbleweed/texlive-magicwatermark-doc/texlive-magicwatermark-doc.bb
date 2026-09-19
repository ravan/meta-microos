SUMMARY = "Documentation for texlive-magicwatermark"
DESCRIPTION = "This package includes the documentation for texlive-magicwatermark"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn76924"

RPM_NAME = "texlive-magicwatermark-doc-2026.226.1.2bsvn76924-59.2.noarch.rpm"
RPM_HASH = "9021cb6990334db2308c206c8a23e1b4573cc9b92021d18de4ea8beda76f39c3886d23f3dc7b54211fce1d5bc537bb26e5821e7f8e0945ed0e694ff0643f993f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-magicwatermark-doc-zh;en \
texlive-magicwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
