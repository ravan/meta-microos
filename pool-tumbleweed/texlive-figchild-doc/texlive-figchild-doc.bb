SUMMARY = "Documentation for texlive-figchild"
DESCRIPTION = "This package includes the documentation for texlive-figchild"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.1svn75801"

RPM_NAME = "texlive-figchild-doc-2026.226.3.1.1svn75801-59.2.noarch.rpm"
RPM_HASH = "befdb2bb266f375dd0fb09817afeb7ef943fb14b064eccb9ac697165bbcb0aeeef3ef88c7659de66545a1dbd2e9b982c3db81d65f7cfdf36babefbe24bd252cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figchild-doc"

RDEPENDS:${PN} += ""

inherit rpm
