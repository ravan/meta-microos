SUMMARY = "Documentation for texlive-srdp-mathematik"
DESCRIPTION = "This package includes the documentation for texlive-srdp-mathematik"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.14.0svn76697"

RPM_NAME = "texlive-srdp-mathematik-doc-2026.226.1.14.0svn76697-64.2.noarch.rpm"
RPM_HASH = "5cad6a4297a2d977fbb048451019faaacfd29c58ac70c5191f414209eaed33ab5572bfbcf427eb79d175dea6cfaadc7d2e026bb049f5833d565881fad5b6504c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-srdp-mathematik-doc-de-at \
texlive-srdp-mathematik-doc"

RDEPENDS:${PN} += ""

inherit rpm
