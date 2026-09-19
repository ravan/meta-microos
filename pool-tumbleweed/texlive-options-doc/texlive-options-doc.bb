SUMMARY = "Documentation for texlive-options"
DESCRIPTION = "This package includes the documentation for texlive-options"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39030"

RPM_NAME = "texlive-options-doc-2026.226.1.0svn39030-61.2.noarch.rpm"
RPM_HASH = "8a5aaaf7f961d272ed898a4d9d4a2e4c51d30953418fd6de40526cec7c457cbcb813402f121e77564e5ee11fd80b26609b536ec01459402780717679445eb907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-options-doc"

RDEPENDS:${PN} += ""

inherit rpm
