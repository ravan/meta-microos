SUMMARY = "Documentation for texlive-poemscol"
DESCRIPTION = "This package includes the documentation for texlive-poemscol"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1415926svn56082"

RPM_NAME = "texlive-poemscol-doc-2026.226.3.1415926svn56082-59.2.noarch.rpm"
RPM_HASH = "3605b608c1b5009cbcd06e88de4d51df070361fae71ff8aea57b47e487dd6eb8ec4380ce063b78347fbd205f769b75a9027faf76c0957ac44d260f46c918c9d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poemscol-doc"

RDEPENDS:${PN} += ""

inherit rpm
