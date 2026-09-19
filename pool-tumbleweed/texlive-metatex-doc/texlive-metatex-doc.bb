SUMMARY = "Documentation for texlive-metatex"
DESCRIPTION = "This package includes the documentation for texlive-metatex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-metatex-doc-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "9c275b1e71e6660399c3e068d5522f4e5a1943fbaddafff2a388869ea40e4b81604b23073f15bb0e7781dbfcd8d51868cb84637519cffd9543dadf6a7a80ea86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
