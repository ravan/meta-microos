SUMMARY = "Documentation for texlive-inkpaper"
DESCRIPTION = "This package includes the documentation for texlive-inkpaper"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn54080"

RPM_NAME = "texlive-inkpaper-doc-2026.226.1.0svn54080-60.2.noarch.rpm"
RPM_HASH = "3cf588ea6ded072df2a0acebfc8493c10343d3e7a36a20230de6ffaf91ce369efb689b4b7f006fe114b9b21f4bec23371e5bf7ba9aefce8bd855165a441e0f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-inkpaper-doc-zh-cn;en \
texlive-inkpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
