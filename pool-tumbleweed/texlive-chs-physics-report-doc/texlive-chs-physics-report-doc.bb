SUMMARY = "Documentation for texlive-chs-physics-report"
DESCRIPTION = "This package includes the documentation for texlive-chs-physics-report"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-chs-physics-report-doc-2026.226.svn54512-60.2.noarch.rpm"
RPM_HASH = "104d0edc0825272952502fb2ce58d6c1ece32c19d925960cde7c2deff83db2003aaffd63f8c5c4a93f2a89f885dbc81788504014f08350bb775e9261e1afed20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chs-physics-report-doc"

RDEPENDS:${PN} += ""

inherit rpm
