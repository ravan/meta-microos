SUMMARY = "Documentation for texlive-liftarm"
DESCRIPTION = "This package includes the documentation for texlive-liftarm"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn76924"

RPM_NAME = "texlive-liftarm-doc-2026.226.4.0svn76924-61.2.noarch.rpm"
RPM_HASH = "754d53b9f83ed22fff497820a3d159d8219f744771de83ef277a4af2b96559f1b824c455fe9b188229f603519c9d964f24268f35e473d37a5a8ecfe7a65b429e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-liftarm-doc"

RDEPENDS:${PN} += ""

inherit rpm
