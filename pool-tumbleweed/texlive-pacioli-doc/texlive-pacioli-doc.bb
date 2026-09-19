SUMMARY = "Documentation for texlive-pacioli"
DESCRIPTION = "This package includes the documentation for texlive-pacioli"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-pacioli-doc-2026.226.svn77682-58.2.noarch.rpm"
RPM_HASH = "351bd7084fad18417ef166421303c26948cbb9884af743462b53da5c6b74d6bc2a35db82954fe03a9cc3555cf03ad304903e6d054181edc7c788153c38474c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pacioli-doc"

RDEPENDS:${PN} += ""

inherit rpm
