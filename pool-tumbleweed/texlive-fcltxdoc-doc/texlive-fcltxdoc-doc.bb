SUMMARY = "Documentation for texlive-fcltxdoc"
DESCRIPTION = "This package includes the documentation for texlive-fcltxdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24500"

RPM_NAME = "texlive-fcltxdoc-doc-2026.226.1.0svn24500-59.2.noarch.rpm"
RPM_HASH = "9b753b334f54caad28f197da1e0c73d5acf1fbad2e39789b3dda7aa67ef5fdd167c1ee83030db257cd77ef8d9611926dccbc48007e4c855b541709272c4161ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fcltxdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
