SUMMARY = "Documentation for texlive-lastbib"
DESCRIPTION = "This package includes the documentation for texlive-lastbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn70376"

RPM_NAME = "texlive-lastbib-doc-2026.226.2.1svn70376-63.2.noarch.rpm"
RPM_HASH = "a33783cf1d2833c4437f0a5d7ad3dc6384a45a6d07aae3c7f42bfe815ad1bd7b94d2d47be6a35e7771baf2895dcb0ddd7bc01facff4cf826d4bea6e2ad26bb56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lastbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
