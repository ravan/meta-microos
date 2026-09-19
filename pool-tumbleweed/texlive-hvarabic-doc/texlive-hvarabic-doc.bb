SUMMARY = "Documentation for texlive-hvarabic"
DESCRIPTION = "This package includes the documentation for texlive-hvarabic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn76924"

RPM_NAME = "texlive-hvarabic-doc-2026.226.0.0.02svn76924-60.2.noarch.rpm"
RPM_HASH = "f1dc68cf80570e7608848aa7c26680785f64161aab2dd2939920eb884a9756c522de3dd312c34e740e9df9221148250a357c67c1f9f4dc08cfbb5c0140653861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvarabic-doc"

RDEPENDS:${PN} += ""

inherit rpm
