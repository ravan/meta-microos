SUMMARY = "Documentation for texlive-babel-hungarian"
DESCRIPTION = "This package includes the documentation for texlive-babel-hungarian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6asvn77586"

RPM_NAME = "texlive-babel-hungarian-doc-2026.226.1.6asvn77586-60.2.noarch.rpm"
RPM_HASH = "f932b3159ab74ae9fe52b590f18062ea8c3cb028bc05e3765fbf8548e3a6daa8e853814d5687173ef7735a5e7bd093c472ee1b85d1b3b90d35256d6a14935de4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-hungarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
