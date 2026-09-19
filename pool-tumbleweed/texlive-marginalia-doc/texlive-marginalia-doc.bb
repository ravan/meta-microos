SUMMARY = "Documentation for texlive-marginalia"
DESCRIPTION = "This package includes the documentation for texlive-marginalia"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.83.20svn77235"

RPM_NAME = "texlive-marginalia-doc-2026.226.0.0.83.20svn77235-59.2.noarch.rpm"
RPM_HASH = "327defbb63aa776cf91c0c13bdd95c67071edf55ba453f05fcc97e5d97e91cd46c6aebd423a4aedb1dd51b970684a9420c7880599677b87ab641761325b9b767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginalia-doc"

RDEPENDS:${PN} += ""

inherit rpm
