SUMMARY = "Documentation for texlive-articleingud"
DESCRIPTION = "This package includes the documentation for texlive-articleingud"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn38741"

RPM_NAME = "texlive-articleingud-doc-2026.226.0.0.3svn38741-60.2.noarch.rpm"
RPM_HASH = "519657ab2f553fc32c1fe78f6a3acada2e5bb2e28e3f17429821931a1d1d1e2f8b3a87d842e231d0b7f6404da5a22b18df8f96fa35d8286ad14f5a01d9ef2da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-articleingud-doc-es \
texlive-articleingud-doc"

RDEPENDS:${PN} += ""

inherit rpm
