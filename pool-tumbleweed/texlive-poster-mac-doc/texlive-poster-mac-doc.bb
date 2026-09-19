SUMMARY = "Documentation for texlive-poster-mac"
DESCRIPTION = "This package includes the documentation for texlive-poster-mac"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn18305"

RPM_NAME = "texlive-poster-mac-doc-2026.226.1.1svn18305-59.2.noarch.rpm"
RPM_HASH = "24c80ec14723551a4a4d0135f5c06187ccf87e5922cce51a9f1a5850ed7b7f3048964c9adee6350158dc3984ca9c8e2753170390c4d56066519c9d8524d45cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poster-mac-doc"

RDEPENDS:${PN} += ""

inherit rpm
