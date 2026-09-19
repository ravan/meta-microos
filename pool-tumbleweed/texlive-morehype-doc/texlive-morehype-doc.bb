SUMMARY = "Documentation for texlive-morehype"
DESCRIPTION = "This package includes the documentation for texlive-morehype"
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.83svn38815"

RPM_NAME = "texlive-morehype-doc-2026.226.r0.83svn38815-61.2.noarch.rpm"
RPM_HASH = "738244ce0e3c226fb3ca937b7660c58c0106ca4dc1cb490749ea413c7f6177d60c4dd92c1f9b4f6979bbc8306ed359d26d9b5826cefe7abc2036d1b06c9cfada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morehype-doc"

RDEPENDS:${PN} += ""

inherit rpm
