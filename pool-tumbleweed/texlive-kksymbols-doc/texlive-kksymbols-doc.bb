SUMMARY = "Documentation for texlive-kksymbols"
DESCRIPTION = "This package includes the documentation for texlive-kksymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.2svn78140"

RPM_NAME = "texlive-kksymbols-doc-2026.226.2.1.2svn78140-63.2.noarch.rpm"
RPM_HASH = "f0b66cad9aad63d56b866bfc28876cf0e08e909afd33d3dedbef9de876b812def65c9b2f4d178ea44b69a4168ea522b476bcdcf2522d18648903455b3c7921ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kksymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
