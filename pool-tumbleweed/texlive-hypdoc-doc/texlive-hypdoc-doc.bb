SUMMARY = "Documentation for texlive-hypdoc"
DESCRIPTION = "This package includes the documentation for texlive-hypdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn68661"

RPM_NAME = "texlive-hypdoc-doc-2026.226.1.19svn68661-60.2.noarch.rpm"
RPM_HASH = "4dd243cc4ed60f3665810886f31795b89963f5d1bd1d8cf97d7c62785e3db9b93501c5b47667c3435d1e51e479866b45c0a208dbb4a66a038490ffd6adfa624c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
