SUMMARY = "Documentation for texlive-pmxchords"
DESCRIPTION = "This package includes the documentation for texlive-pmxchords"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.2svn73868"

RPM_NAME = "texlive-pmxchords-doc-2026.226.2.0.2svn73868-59.2.noarch.rpm"
RPM_HASH = "c29f32eeb03323fdd2c9249e7e7603d6f12cba0866cc944b32b8b2f2a77d38c6aff54fb2f3b1fcf5d66f4b5709a883d6dd8c57119d7be00a3525731f78afe5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pmxchords-doc-en;cs \
man-pmxchords.1 \
texlive-pmxchords-doc"

RDEPENDS:${PN} += ""

inherit rpm
