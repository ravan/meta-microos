SUMMARY = "Documentation for texlive-venndiagram"
DESCRIPTION = "This package includes the documentation for texlive-venndiagram"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn47952"

RPM_NAME = "texlive-venndiagram-doc-2026.226.1.2svn47952-60.2.noarch.rpm"
RPM_HASH = "5db7212a3fd23c2dc056b5d59174ba491402ca3dfc6b5b634228d810d64e791493e38c87f748887b5ae86f61f641278e7b0dbc34f803a851da1ea2bf4ffcf501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venndiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
