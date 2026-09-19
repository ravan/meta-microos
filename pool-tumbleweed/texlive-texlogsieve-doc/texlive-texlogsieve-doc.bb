SUMMARY = "Documentation for texlive-texlogsieve"
DESCRIPTION = "This package includes the documentation for texlive-texlogsieve"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.6.1svn77351"

RPM_NAME = "texlive-texlogsieve-doc-2026.227.1.6.1svn77351-62.2.noarch.rpm"
RPM_HASH = "c46aaa93796c53d50ab7b0b487ec3d2df656ea830ec5a4b8501a87f1ee899def37c1a61518f8bb822856a6934d761d50401cfe77bbecd6cb428bc7f4d76543fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texlogsieve.1 \
texlive-texlogsieve-doc"

RDEPENDS:${PN} += ""

inherit rpm
