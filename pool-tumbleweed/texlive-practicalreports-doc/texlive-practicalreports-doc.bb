SUMMARY = "Documentation for texlive-practicalreports"
DESCRIPTION = "This package includes the documentation for texlive-practicalreports"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.3svn52312"

RPM_NAME = "texlive-practicalreports-doc-2026.226.2.0.3svn52312-59.2.noarch.rpm"
RPM_HASH = "8da79f335a21457c1b89e268b42ad586638a84c1d9f250e9b5fd6d3928d219df7f3a4fb20c6466a3ff9585cc2a2c88ddf4972d7d62b261275c8373fc700260d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-practicalreports-doc"

RDEPENDS:${PN} += ""

inherit rpm
