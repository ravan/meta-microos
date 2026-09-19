SUMMARY = "Documentation for texlive-context-gnuplot"
DESCRIPTION = "This package includes the documentation for texlive-context-gnuplot"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75301"

RPM_NAME = "texlive-context-gnuplot-doc-2026.226.svn75301-61.2.noarch.rpm"
RPM_HASH = "b7d478febb65e20ed012b52bc02783913015234cd716b188568c40df4492b50add6c938cc14cb2ed29701eb7ce502138c1e070f2f2a9b31d8346568124a8a574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-gnuplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
