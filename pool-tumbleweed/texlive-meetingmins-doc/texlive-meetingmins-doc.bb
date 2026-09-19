SUMMARY = "Documentation for texlive-meetingmins"
DESCRIPTION = "This package includes the documentation for texlive-meetingmins"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn31878"

RPM_NAME = "texlive-meetingmins-doc-2026.226.1.6svn31878-59.2.noarch.rpm"
RPM_HASH = "b2c4e136bb9a553c11556bdaafa35f479384db1adc0a50aa9bb455dce5a4f98eb41bd346cbca80d3482fc8887375347fc1cd2637a594cf11aee2c1efac27e4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-meetingmins-doc"

RDEPENDS:${PN} += ""

inherit rpm
