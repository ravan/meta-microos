SUMMARY = "Documentation for texlive-appendixnumberbeamer"
DESCRIPTION = "This package includes the documentation for texlive-appendixnumberbeamer"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-appendixnumberbeamer-doc-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "5341eccf0a0f9fb03abdb78001a97508d83cadef10a4b617b67e235d5855560bc22e5eb607f28581c4268d6156dc1022353965d1a72cca7af581b92263b8eb32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-appendixnumberbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
