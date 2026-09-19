SUMMARY = "Documentation for texlive-synthslant"
DESCRIPTION = "This package includes the documentation for texlive-synthslant"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76662"

RPM_NAME = "texlive-synthslant-doc-2026.226.0.0.2svn76662-64.2.noarch.rpm"
RPM_HASH = "1e8d1c8b42a7e71e57ac338af38d8342ea74c152ec565624a68e8ef53686f462c015ae88f169f832f9c800243eadd159973efd2718bfedc01e2b2508b8b29121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-synthslant-doc"

RDEPENDS:${PN} += ""

inherit rpm
