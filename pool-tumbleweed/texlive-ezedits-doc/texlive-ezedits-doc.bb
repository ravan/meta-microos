SUMMARY = "Documentation for texlive-ezedits"
DESCRIPTION = "This package includes the documentation for texlive-ezedits"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn72849"

RPM_NAME = "texlive-ezedits-doc-2026.226.1.1svn72849-59.2.noarch.rpm"
RPM_HASH = "2c73bdff9f6210acacf127dc20400211231b865bf03d82a9994945a2b7cfb0871a30200428d5b7b4e701ba28c28444a6feee0126f2188c09b72c0778f8d2df8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ezedits-doc"

RDEPENDS:${PN} += ""

inherit rpm
