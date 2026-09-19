SUMMARY = "Documentation for texlive-ragged2e"
DESCRIPTION = "This package includes the documentation for texlive-ragged2e"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn77682"

RPM_NAME = "texlive-ragged2e-doc-2026.226.3.6svn77682-60.4.noarch.rpm"
RPM_HASH = "733fa593d4c514c52e0e4b0284d90b9baec572dd89a210ce50570b861b9bb7241ff0df76e5ab716c80074976510501efdd39b9196e37904461ea93bf3b957344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ragged2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
