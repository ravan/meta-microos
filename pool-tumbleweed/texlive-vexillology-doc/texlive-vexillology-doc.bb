SUMMARY = "Documentation for texlive-vexillology"
DESCRIPTION = "This package includes the documentation for texlive-vexillology"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn77381"

RPM_NAME = "texlive-vexillology-doc-2026.226.1.0.0svn77381-60.2.noarch.rpm"
RPM_HASH = "a49d24f276ccbc1fc8a86904a7f3ee80d9817df4a3c6a3fcb53dac737d36d15480312f4468712f82754aaa94f3b285a6887af7151a2f3468dd7c02c055fb46c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vexillology-doc"

RDEPENDS:${PN} += ""

inherit rpm
