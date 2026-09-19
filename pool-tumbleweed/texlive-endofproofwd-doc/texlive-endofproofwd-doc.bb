SUMMARY = "Documentation for texlive-endofproofwd"
DESCRIPTION = "This package includes the documentation for texlive-endofproofwd"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55643"

RPM_NAME = "texlive-endofproofwd-doc-2026.226.svn55643-61.4.noarch.rpm"
RPM_HASH = "e462be1f01e4022edc3fe2fad241dfbb6bdb285aed8d122218b7840d5771fdb55b3ab7565c04b8bc4c0024bb3bd60f302e981a4a97722fea6140d9d84d8dc109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endofproofwd-doc"

RDEPENDS:${PN} += ""

inherit rpm
