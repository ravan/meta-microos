SUMMARY = "Documentation for texlive-minim-hatching"
DESCRIPTION = "This package includes the documentation for texlive-minim-hatching"
LICENSE = "LPPL-1.0"

PV = "2026.226.2022_1.1svn70885"

RPM_NAME = "texlive-minim-hatching-doc-2026.226.2022_1.1svn70885-61.2.noarch.rpm"
RPM_HASH = "7a9d9378b229cbb9572d44fa792a5f4e5f4480fbbd8201af7e12cb290e624f582cbe2ed5e67eb67df83a49e07ef459088cfb2214fef1453c54219cc5681cf69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-hatching-doc"

RDEPENDS:${PN} += ""

inherit rpm
