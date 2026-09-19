SUMMARY = "Documentation for texlive-tabularcalc"
DESCRIPTION = "This package includes the documentation for texlive-tabularcalc"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2svn77682"

RPM_NAME = "texlive-tabularcalc-doc-2026.227.0.0.2svn77682-62.2.noarch.rpm"
RPM_HASH = "8b555d93db677b31b9603b43c04ce8a404050adfd63524de020a654dc4f8f1f6ad4711a4ebcb9a74a1e22aab20961ebefa897e425fe71ceca2ecd64beef688f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabularcalc-doc-en;fr \
texlive-tabularcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
