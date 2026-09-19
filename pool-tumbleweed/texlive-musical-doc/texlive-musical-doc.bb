SUMMARY = "Documentation for texlive-musical"
DESCRIPTION = "This package includes the documentation for texlive-musical"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn54758"

RPM_NAME = "texlive-musical-doc-2026.226.3.1svn54758-61.2.noarch.rpm"
RPM_HASH = "e2c1d137ef1b429c47560c69edefb34c1abdd194505716305ed6fc40a25e7c7b9a6cf522721470c1d0deb0e8655973d175e97aad43e20fc430a37bd6d92c33e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musical-doc"

RDEPENDS:${PN} += ""

inherit rpm
