SUMMARY = "Documentation for texlive-venn"
DESCRIPTION = "This package includes the documentation for texlive-venn"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-venn-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "6c7f4d56a05652a0d061bdabd1a38291f49f2a51589f84fcfdc83dce6d81ddc9320b1180892497c9fdd48b06a3392379d3ce0c49d4401ec45c83a6f48e6f947f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venn-doc"

RDEPENDS:${PN} += ""

inherit rpm
