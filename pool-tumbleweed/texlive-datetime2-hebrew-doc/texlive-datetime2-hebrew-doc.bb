SUMMARY = "Documentation for texlive-datetime2-hebrew"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-hebrew"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47534"

RPM_NAME = "texlive-datetime2-hebrew-doc-2026.226.1.1svn47534-59.2.noarch.rpm"
RPM_HASH = "80028c0f6b4e5b9838da79324b3a0176d20472a9999a49ab8635b0ae5899c5c1a108a6c41d0d195248ab27d11608e550b9a36aa25427461dd38b13d34e2ed4fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-hebrew-doc"

RDEPENDS:${PN} += ""

inherit rpm
