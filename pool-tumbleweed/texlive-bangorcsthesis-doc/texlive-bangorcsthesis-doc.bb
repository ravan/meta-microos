SUMMARY = "Documentation for texlive-bangorcsthesis"
DESCRIPTION = "This package includes the documentation for texlive-bangorcsthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.7svn75154"

RPM_NAME = "texlive-bangorcsthesis-doc-2026.226.1.5.7svn75154-60.2.noarch.rpm"
RPM_HASH = "250b9e58f0dac44f43539e4b14c8f20e20654fdd63e6fa5602944996a815f95ae8f762f5cf6b10a6c2ab75411e531b22f988982ffa439062af019b0d29d73213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangorcsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
