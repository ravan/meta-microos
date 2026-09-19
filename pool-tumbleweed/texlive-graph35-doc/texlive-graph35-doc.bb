SUMMARY = "Documentation for texlive-graph35"
DESCRIPTION = "This package includes the documentation for texlive-graph35"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn66772"

RPM_NAME = "texlive-graph35-doc-2026.226.0.0.1.4svn66772-60.4.noarch.rpm"
RPM_HASH = "0b9ce3711dedeb393d7c06d1083b50056b994e48ebeb5038ba58f26d2b0afce99e0b46f0b1962f2af1d25f9a3dc5fccfb5a21d6117488cd1d6a569c7265f5945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-graph35-doc-fr \
texlive-graph35-doc"

RDEPENDS:${PN} += ""

inherit rpm
