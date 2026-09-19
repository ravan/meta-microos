SUMMARY = "Documentation for texlive-pdfjam"
DESCRIPTION = "This package includes the documentation for texlive-pdfjam"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.2svn75152"

RPM_NAME = "texlive-pdfjam-doc-2026.226.4.2svn75152-58.2.noarch.rpm"
RPM_HASH = "740aac0be01f95d83158cf55ceef6e3aec20a6125ad532ba517a604893b1f7f20ffe8bdd0874cb8d20065577bac2470c7910f4f29ef413552234511c660c6e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfjam.1 \
texlive-pdfjam-doc"

RDEPENDS:${PN} += ""

inherit rpm
