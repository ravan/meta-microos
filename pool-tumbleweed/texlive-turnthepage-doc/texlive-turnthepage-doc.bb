SUMMARY = "Documentation for texlive-turnthepage"
DESCRIPTION = "This package includes the documentation for texlive-turnthepage"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0asvn77682"

RPM_NAME = "texlive-turnthepage-doc-2026.226.2.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "73fc13bf87aec157ce4fc3d026ebf5d2f52f2a9ea0bef111021ac2228cdd36148e149638245130ddda1f2905d6da10b9408bfdbd3bae3c5358a8c98f60e9222e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turnthepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
