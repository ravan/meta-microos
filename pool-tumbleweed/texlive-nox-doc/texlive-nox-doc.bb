SUMMARY = "Documentation for texlive-nox"
DESCRIPTION = "This package includes the documentation for texlive-nox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn30991"

RPM_NAME = "texlive-nox-doc-2026.226.1.0svn30991-61.2.noarch.rpm"
RPM_HASH = "ae9c5a9d9f04e921c54adaa9f8902a88120b5bd4a16aab1bd38e30950be4266793d0ead83753f24845e768166495de357948b6d1eee698e9671ad85768c1c561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nox-doc-de \
texlive-nox-doc"

RDEPENDS:${PN} += ""

inherit rpm
