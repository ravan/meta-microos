SUMMARY = "Documentation for texlive-uwa-pif"
DESCRIPTION = "This package includes the documentation for texlive-uwa-pif"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn78219"

RPM_NAME = "texlive-uwa-pif-doc-2026.226.1.0.1svn78219-60.2.noarch.rpm"
RPM_HASH = "412c3aff24101cabb14b95f32e28505119e282b3138845f6cfefad625b89cedf1a22bf3a7e5823f2ab6a42d62119d65b24cc1ef649b9297d0a5c000a3a7ca68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-pif-doc"

RDEPENDS:${PN} += ""

inherit rpm
