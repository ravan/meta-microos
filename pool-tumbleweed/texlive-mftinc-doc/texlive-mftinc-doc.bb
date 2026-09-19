SUMMARY = "Documentation for texlive-mftinc"
DESCRIPTION = "This package includes the documentation for texlive-mftinc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn15878"

RPM_NAME = "texlive-mftinc-doc-2026.226.1.0asvn15878-61.2.noarch.rpm"
RPM_HASH = "8bb2b84c92bdab99253bba508bb34016591607ac5f52e1acad6411400a20d74f644140c3465d4aed9a2e06581ec5c582a22503839fbf08a06687b63bc985fc1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mftinc-doc"

RDEPENDS:${PN} += ""

inherit rpm
