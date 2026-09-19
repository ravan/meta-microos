SUMMARY = "Documentation for texlive-pst-knot"
DESCRIPTION = "This package includes the documentation for texlive-pst-knot"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn16033"

RPM_NAME = "texlive-pst-knot-doc-2026.226.0.0.2svn16033-59.2.noarch.rpm"
RPM_HASH = "26d791e08f8baf5e1639f88e8449d62840b46b1ce0a2c733f8783d7f1ac1636bba8899f17f1993637839d3be50a6e10031c1d4a4f87e62ea4135bffff03f6f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-knot-doc"

RDEPENDS:${PN} += ""

inherit rpm
