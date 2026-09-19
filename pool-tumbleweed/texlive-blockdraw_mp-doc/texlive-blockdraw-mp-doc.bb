SUMMARY = "Documentation for texlive-blockdraw_mp"
DESCRIPTION = "This package includes the documentation for texlive-blockdraw_mp"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-blockdraw_mp-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "2a8d48ab2b5e77c6b2bcf9cd40fdb2d6ae0e614e02f3bf42c092ef63c0caac2a118dce5b456fd67163815dab59a430dc7800aa10d58fd9352e4b5fc6b1c6430a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blockdraw-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
