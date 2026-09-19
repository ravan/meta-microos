SUMMARY = "Documentation for texlive-resphilosophica"
DESCRIPTION = "This package includes the documentation for texlive-resphilosophica"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.39svn76471"

RPM_NAME = "texlive-resphilosophica-doc-2026.226.1.39svn76471-60.4.noarch.rpm"
RPM_HASH = "71094c00d522b2b6c04316d341ba8d3d481b23d69306bf9fb091d4c455d4aa717724f5027bfaefbcee872f0d65348fdccc83b31cce3838ab798dd209e5f8e5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resphilosophica-doc"

RDEPENDS:${PN} += ""

inherit rpm
