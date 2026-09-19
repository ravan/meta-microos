SUMMARY = "Documentation for texlive-href-ul"
DESCRIPTION = "This package includes the documentation for texlive-href-ul"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.2svn74512"

RPM_NAME = "texlive-href-ul-doc-2026.226.0.0.5.2svn74512-60.4.noarch.rpm"
RPM_HASH = "446bf7c7293b1026fac225c7c5348e240ef08272b3cccfe849bf545ba5b8b42aa352f044312467b7dcca0e0a63a65ac74243032b624e322cdad51db0a571d8d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-href-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
