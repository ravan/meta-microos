SUMMARY = "Documentation for texlive-svn"
DESCRIPTION = "This package includes the documentation for texlive-svn"
LICENSE = "LPPL-1.0"

PV = "2026.226.43svn15878"

RPM_NAME = "texlive-svn-doc-2026.226.43svn15878-64.2.noarch.rpm"
RPM_HASH = "1e514f4b2891799b635506dfe2536d3aa793276b90585e5783561d80a0612ce956497285113a29a25c80ee73379927891f88e5b6ab090731dc6fcbb34c821081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-doc"

RDEPENDS:${PN} += ""

inherit rpm
