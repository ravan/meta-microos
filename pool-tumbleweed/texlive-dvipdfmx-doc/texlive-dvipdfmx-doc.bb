SUMMARY = "Documentation for texlive-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-dvipdfmx"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77942"

RPM_NAME = "texlive-dvipdfmx-doc-2026.226.svn77942-61.4.noarch.rpm"
RPM_HASH = "5c24c1e8cee37e160290dc62b8a771b52f3c9c8ddc7050ae9be0b7d0df585e1ecce338aaa809722604c62f226eb2715292fee7b13712b386e8219633df50b461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvipdfm.1 \
man-dvipdfmx.1 \
man-dvipdft.1 \
man-ebb.1 \
man-xdvipdfmx.1 \
texlive-dvipdfmx-doc"

RDEPENDS:${PN} += ""

inherit rpm
