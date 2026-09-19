SUMMARY = "Documentation for texlive-catcodes"
DESCRIPTION = "This package includes the documentation for texlive-catcodes"
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.2svn38859"

RPM_NAME = "texlive-catcodes-doc-2026.226.r0.2svn38859-59.2.noarch.rpm"
RPM_HASH = "0f40d2a97589bdb653971755333833f02bbcf73a4964b6c06e472dc08e1013fc99dd398455a05da25dfcd84a8b7e3f66c664eaca83d8c9cccc68ad0c0a95ae17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catcodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
