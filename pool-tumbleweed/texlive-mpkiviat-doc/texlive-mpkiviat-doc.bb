SUMMARY = "Documentation for texlive-mpkiviat"
DESCRIPTION = "This package includes the documentation for texlive-mpkiviat"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn75712"

RPM_NAME = "texlive-mpkiviat-doc-2026.226.0.0.1svn75712-61.2.noarch.rpm"
RPM_HASH = "09a3709b937efde5243732c25463feb6c69866e3f6921b8427cc360e4cf710a92a0ef43f57d039844f48ab36330b2bd20f05d8adf6d5a3296b152b04ce7671cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpkiviat-doc"

RDEPENDS:${PN} += ""

inherit rpm
