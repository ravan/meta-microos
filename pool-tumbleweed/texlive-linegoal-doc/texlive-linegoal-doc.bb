SUMMARY = "Documentation for texlive-linegoal"
DESCRIPTION = "This package includes the documentation for texlive-linegoal"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn21523"

RPM_NAME = "texlive-linegoal-doc-2026.226.2.9svn21523-61.2.noarch.rpm"
RPM_HASH = "1312d3f9ea492b1cc9c2a0cb4995cec50600d05fd4b4dd67b0d67f223ca80d083342f8b8fbb1ddbef1bec577befc64fc7ae76c30170f73cdcd86fd94ada649ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linegoal-doc"

RDEPENDS:${PN} += ""

inherit rpm
