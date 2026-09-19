SUMMARY = "Documentation for texlive-musixguit"
DESCRIPTION = "This package includes the documentation for texlive-musixguit"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn21649"

RPM_NAME = "texlive-musixguit-doc-2026.226.1.2.2svn21649-61.2.noarch.rpm"
RPM_HASH = "d01628c68c9885e3c808b6e99cfe4b4251e0f26541c48f23bb14f24552f722f87d4d37b989bdf405bad21e21eb1254c77520a4df689be4f40f85c383b1c4608d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-musixguit-doc-de \
texlive-musixguit-doc"

RDEPENDS:${PN} += ""

inherit rpm
