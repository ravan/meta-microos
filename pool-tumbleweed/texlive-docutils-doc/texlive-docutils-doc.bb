SUMMARY = "Documentation for texlive-docutils"
DESCRIPTION = "This package includes the documentation for texlive-docutils"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn56594"

RPM_NAME = "texlive-docutils-doc-2026.226.svn56594-59.2.noarch.rpm"
RPM_HASH = "01247167432f74b8d722e653f37cd60c694f05626d4a799ee688fbd2bcfe917dc89ddaaba7c481f640c7eea5b6f2f23c4fbb19e485e4c351f36a168c826956c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
