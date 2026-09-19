SUMMARY = "Documentation for texlive-nihbiosketch"
DESCRIPTION = "This package includes the documentation for texlive-nihbiosketch"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54191"

RPM_NAME = "texlive-nihbiosketch-doc-2026.226.svn54191-61.2.noarch.rpm"
RPM_HASH = "d78d00a3744ba79e72d69944c6d60ec652f66c01fd3fdb0a462a1a93ae62fb48c9ecb1e639e4e25fd72c35026fd2f270493a4cd9960fa3c4397317f0c31a0dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nihbiosketch-doc"

RDEPENDS:${PN} += ""

inherit rpm
