SUMMARY = "Documentation for texlive-baekmuk"
DESCRIPTION = "This package includes the documentation for texlive-baekmuk"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-doc-2026.226.2.2.1svn56915-60.2.noarch.rpm"
RPM_HASH = "d11d5ea6175333640c599292a5206304fa540f00f177fb478173557558add0c61e47920c46fc9bd56c46a47424db261208be6c910c878bd326232c38e33d132f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baekmuk-doc"

RDEPENDS:${PN} += ""

inherit rpm
