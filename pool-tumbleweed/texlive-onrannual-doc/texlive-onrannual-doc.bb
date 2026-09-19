SUMMARY = "Documentation for texlive-onrannual"
DESCRIPTION = "This package includes the documentation for texlive-onrannual"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn17474"

RPM_NAME = "texlive-onrannual-doc-2026.226.1.1svn17474-61.2.noarch.rpm"
RPM_HASH = "f5d03e353cc80f7f31a73a9dc16573d3adc72afa291bb8f930c3a13bcff7b21476b6b7466a919af4b4ca7b0af6982c64a53b0d0853c2e8c67ded8ec44ad35e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onrannual-doc"

RDEPENDS:${PN} += ""

inherit rpm
