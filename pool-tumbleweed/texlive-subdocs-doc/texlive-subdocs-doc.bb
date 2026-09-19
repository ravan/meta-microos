SUMMARY = "Documentation for texlive-subdocs"
DESCRIPTION = "This package includes the documentation for texlive-subdocs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn51480"

RPM_NAME = "texlive-subdocs-doc-2026.226.0.0.1svn51480-64.2.noarch.rpm"
RPM_HASH = "8def8a238c7a6dcfd29b51b69b0ebefa693209ffdab03dbd6a15af00d7f2e49c4aa0dda4e8cd438c07d4f718a778fed7d89be6c5767a67ed960bf61788e0047b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subdocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
