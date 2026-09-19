SUMMARY = "Documentation for texlive-concepts"
DESCRIPTION = "This package includes the documentation for texlive-concepts"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.5_r1svn29020"

RPM_NAME = "texlive-concepts-doc-2026.226.0.0.0.5_r1svn29020-60.2.noarch.rpm"
RPM_HASH = "6be6f02a2d498f72deb3d4647e422384e8dde2562f518e1b7c97a939f61bd64169df2ecb2661d5395f7403b7a8305457000d6e799e57632bbe5061e5b3f7716d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concepts-doc"

RDEPENDS:${PN} += ""

inherit rpm
