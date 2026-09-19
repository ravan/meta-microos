SUMMARY = "Documentation for texlive-imfellenglish"
DESCRIPTION = "This package includes the documentation for texlive-imfellenglish"
LICENSE = "OFL-1.1"

PV = "2026.226.svn64568"

RPM_NAME = "texlive-imfellenglish-doc-2026.226.svn64568-60.2.noarch.rpm"
RPM_HASH = "d626dceb5955d9aad91f71b5b8bd358bc4d714655878425e54dd50c7081ea3c6023f60321dbdb1c8dd853336658cc048c7e91cb5b9277694fdb72aba8691e9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imfellenglish-doc"

RDEPENDS:${PN} += ""

inherit rpm
