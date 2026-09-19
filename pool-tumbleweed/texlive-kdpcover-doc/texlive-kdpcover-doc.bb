SUMMARY = "Documentation for texlive-kdpcover"
DESCRIPTION = "This package includes the documentation for texlive-kdpcover"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.1svn74392"

RPM_NAME = "texlive-kdpcover-doc-2026.226.0.0.6.1svn74392-63.2.noarch.rpm"
RPM_HASH = "b4050d2925053f5ff3cff4971da96fb5268acea8f29fd32f9e2adeb4257ecfc40f40fff47738bd2f4739e05ee0b05f7dbb63ac3d4a0ab80f77ab2b21e64d384a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kdpcover-doc"

RDEPENDS:${PN} += ""

inherit rpm
