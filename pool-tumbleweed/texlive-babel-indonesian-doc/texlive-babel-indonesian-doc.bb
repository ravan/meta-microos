SUMMARY = "Documentation for texlive-babel-indonesian"
DESCRIPTION = "This package includes the documentation for texlive-babel-indonesian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0nsvn77682"

RPM_NAME = "texlive-babel-indonesian-doc-2026.226.1.0nsvn77682-60.2.noarch.rpm"
RPM_HASH = "c427e11602a7481ae4d07a3053982b0ef73252b2f82137ff7004a7eaf68df5d50b06d83f76bd91e6f9758c99692e93ab6da5c72fd227bdd4212f0b1e1afb746a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-indonesian-doc"

RDEPENDS:${PN} += ""

inherit rpm
