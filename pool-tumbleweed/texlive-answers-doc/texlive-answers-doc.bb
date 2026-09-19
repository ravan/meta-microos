SUMMARY = "Documentation for texlive-answers"
DESCRIPTION = "This package includes the documentation for texlive-answers"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn77682"

RPM_NAME = "texlive-answers-doc-2026.226.2.16svn77682-61.2.noarch.rpm"
RPM_HASH = "21ff84ad10094cbe292096534d265331c3ff7decc71b496ef214f2ee12ee24987004a3ccc537929477ef692bfafd1be87c0484d5b6a16a3753ed3027f9f316ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-answers-doc"

RDEPENDS:${PN} += ""

inherit rpm
