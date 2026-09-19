SUMMARY = "Documentation for texlive-covington"
DESCRIPTION = "This package includes the documentation for texlive-covington"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn77216"

RPM_NAME = "texlive-covington-doc-2026.226.2.16svn77216-61.2.noarch.rpm"
RPM_HASH = "466bee3080faf2b01ff4391bd4a94ae5c7dd5e8bb30b7daf9e7e27dd06e6c6dde6ce8817b8d8e8b150c69e660b933ec5d1cbf1456cb365b7603328be46c380af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-covington-doc"

RDEPENDS:${PN} += ""

inherit rpm
