SUMMARY = "Documentation for texlive-gfssolomos"
DESCRIPTION = "This package includes the documentation for texlive-gfssolomos"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfssolomos-doc-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "221f224894000a96074bdda1c82deacf60c9947e0e2f32ad1267b82881f527bc2671010d0039799749a6478bdf121b201b1b88e48d0311106aa40646c2b7e4f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfssolomos-doc"

RDEPENDS:${PN} += ""

inherit rpm
