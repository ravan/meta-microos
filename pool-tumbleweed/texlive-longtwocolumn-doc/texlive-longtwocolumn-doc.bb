SUMMARY = "Documentation for texlive-longtwocolumn"
DESCRIPTION = "This package includes the documentation for texlive-longtwocolumn"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn75852"

RPM_NAME = "texlive-longtwocolumn-doc-2026.226.0.0.1svn75852-61.2.noarch.rpm"
RPM_HASH = "492a25a0760187d6cbaf53c73c30d34032618c3c9ad7ab5ca40f4f38981b302897a4206f93a1e7e4c43f4e5800994a9d8fb42e07bdcf14f08656a35ad3f1b7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longtwocolumn-doc"

RDEPENDS:${PN} += ""

inherit rpm
