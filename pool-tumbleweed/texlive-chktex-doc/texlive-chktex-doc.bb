SUMMARY = "Documentation for texlive-chktex"
DESCRIPTION = "This package includes the documentation for texlive-chktex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.7.10svn78219"

RPM_NAME = "texlive-chktex-doc-2026.226.1.7.10svn78219-60.2.noarch.rpm"
RPM_HASH = "f262526816d7ed09451e1231e57d63a9878a7d8dbc758e79b4b7be729c0ff66deb03eceaeb24f4636a948c4c3bd4fe310f79d494d3f0deabab1e710a3f4dca86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-chktex.1 \
man-chkweb.1 \
man-deweb.1 \
texlive-chktex-doc"

RDEPENDS:${PN} += ""

inherit rpm
