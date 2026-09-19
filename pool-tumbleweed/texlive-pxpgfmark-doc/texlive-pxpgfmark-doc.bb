SUMMARY = "Documentation for texlive-pxpgfmark"
DESCRIPTION = "This package includes the documentation for texlive-pxpgfmark"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-pxpgfmark-doc-2026.226.0.0.2svn77682-60.4.noarch.rpm"
RPM_HASH = "918db7103c2ed35fec5a07580ee1dce9685330962ea8f5465aa295538e5f18bfef50ddecb0ec1aa2c4e3f2f312096d6f70ee2ee728c83bfe4dec138daf5bb6b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpgfmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
