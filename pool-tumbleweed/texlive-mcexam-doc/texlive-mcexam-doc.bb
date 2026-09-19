SUMMARY = "Documentation for texlive-mcexam"
DESCRIPTION = "This package includes the documentation for texlive-mcexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn60481"

RPM_NAME = "texlive-mcexam-doc-2026.226.0.0.5svn60481-59.2.noarch.rpm"
RPM_HASH = "dab793ab3bf8b7c173caf4fd3773efda334c7ae6d5f2910b9b3d9738171689e68270ae76c394ab733ec3705c5c8972bcabd678a96c5f7c468cc05029d8744c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
