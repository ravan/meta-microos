SUMMARY = "Documentation for texlive-commalists-tools"
DESCRIPTION = "This package includes the documentation for texlive-commalists-tools"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn78008"

RPM_NAME = "texlive-commalists-tools-doc-2026.226.0.0.20asvn78008-60.2.noarch.rpm"
RPM_HASH = "328327877f62b822c73c897f6e7aba85f8e1e20b9ab2cba3ea1c9885036cf42917133596473c74da05526a84e0b703b297767b284f8b6a39d9fdfd6468a33279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commalists-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
