SUMMARY = "Documentation for texlive-babel-malay"
DESCRIPTION = "This package includes the documentation for texlive-babel-malay"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0msvn77682"

RPM_NAME = "texlive-babel-malay-doc-2026.226.1.0msvn77682-60.2.noarch.rpm"
RPM_HASH = "377f9ecafa55ac678a21f1bedd3921568d2ebd118c29b2b9287b1865b1d3e2e15ec21bdc57c474da7f68a74c9641692f386a0184029e90585bcaf85862e48d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-malay-doc"

RDEPENDS:${PN} += ""

inherit rpm
