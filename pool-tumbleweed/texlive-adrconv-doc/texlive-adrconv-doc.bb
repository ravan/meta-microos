SUMMARY = "Documentation for texlive-adrconv"
DESCRIPTION = "This package includes the documentation for texlive-adrconv"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76790"

RPM_NAME = "texlive-adrconv-doc-2026.226.1.4svn76790-61.2.noarch.rpm"
RPM_HASH = "fc60e2233def4d227520a7e99556a150bf5a3dc8350273deecb989d91d5f925398a71d13ca319d5c185a8806143bdf8688bc5300c83e98d6394f0489acd6f68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-adrconv-doc-de \
texlive-adrconv-doc"

RDEPENDS:${PN} += ""

inherit rpm
