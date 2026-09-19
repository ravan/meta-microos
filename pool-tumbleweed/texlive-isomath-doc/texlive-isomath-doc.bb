SUMMARY = "Documentation for texlive-isomath"
DESCRIPTION = "This package includes the documentation for texlive-isomath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.1svn27654"

RPM_NAME = "texlive-isomath-doc-2026.226.0.0.6.1svn27654-63.2.noarch.rpm"
RPM_HASH = "76b8421e28204fc3e72765aff9a6cb6d36ca09043866c794a8592cf73420ed9f17ab29667dfd78d26c60169a63f8ee65322d4d54b0c4105eb51f77e909128ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isomath-doc"

RDEPENDS:${PN} += ""

inherit rpm
