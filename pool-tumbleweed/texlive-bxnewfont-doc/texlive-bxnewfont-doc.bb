SUMMARY = "Documentation for texlive-bxnewfont"
DESCRIPTION = "This package includes the documentation for texlive-bxnewfont"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2bsvn44173"

RPM_NAME = "texlive-bxnewfont-doc-2026.226.0.0.2bsvn44173-59.2.noarch.rpm"
RPM_HASH = "5a54077d1fe2cbb8a76531b7bc334ef5eb1e5166b1b3e5294d1c78288633baacf0ee49966fae2cfdd500ec9f62516b50e7207caa7509a9bbbc6f95a74bccaaea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxnewfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
