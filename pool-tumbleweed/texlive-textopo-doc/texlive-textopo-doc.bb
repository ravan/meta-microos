SUMMARY = "Documentation for texlive-textopo"
DESCRIPTION = "This package includes the documentation for texlive-textopo"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.5svn23796"

RPM_NAME = "texlive-textopo-doc-2026.227.1.5svn23796-62.2.noarch.rpm"
RPM_HASH = "4a0903870927fd273428653ec09c826a2265d8c3121de31d8afa532c864f07547e4e8e4debedd58acffd0f4ca9ddac03f4ac7436266bec54582340b1f98dcdd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textopo-doc"

RDEPENDS:${PN} += ""

inherit rpm
