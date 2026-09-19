SUMMARY = "Documentation for texlive-pdftex-quiet"
DESCRIPTION = "This package includes the documentation for texlive-pdftex-quiet"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.0svn49169"

RPM_NAME = "texlive-pdftex-quiet-doc-2026.226.1.1.0svn49169-58.2.noarch.rpm"
RPM_HASH = "29f0f92730fbabc793617d7680d1fb95bdd85569e510fdb5525ecbbf34785793c4f0798e21143cffabcaf4174993d74ea1c96041005b6541f8613aa7a5c4b5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftex-quiet-doc"

RDEPENDS:${PN} += ""

inherit rpm
