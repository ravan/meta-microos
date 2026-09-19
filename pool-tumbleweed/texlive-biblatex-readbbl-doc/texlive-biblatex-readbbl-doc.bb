SUMMARY = "Documentation for texlive-biblatex-readbbl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-readbbl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn61549"

RPM_NAME = "texlive-biblatex-readbbl-doc-2026.226.0.0.01svn61549-61.2.noarch.rpm"
RPM_HASH = "e85a09c8ea24505b41ecab08d846abeb4243068799025c3b47714cddcd817707130a81c1503a1f2482b7108d434ec36a9fa3bc96aa3f530ba616fa50d63bc91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-readbbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
