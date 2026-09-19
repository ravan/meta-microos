SUMMARY = "Documentation for texlive-calligra"
DESCRIPTION = "This package includes the documentation for texlive-calligra"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-calligra-doc-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "e6e8c5eaf555582149312b08a8b69e91343096a55d552ed3fdb9989d5316c560a5177d02988d60406e10ba0d1e4fad22099989d4f417410bb13bee142c46c8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calligra-doc"

RDEPENDS:${PN} += ""

inherit rpm
