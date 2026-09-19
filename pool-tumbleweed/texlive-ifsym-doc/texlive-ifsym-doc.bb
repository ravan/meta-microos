SUMMARY = "Documentation for texlive-ifsym"
DESCRIPTION = "This package includes the documentation for texlive-ifsym"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-ifsym-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "d7a7363002c822debb9902b51b0f754b9e593695b814e95d7c7c65351c0aa06a697ec472cf442004ab7431635e940681ba8cacc76be31d0b76fd91f8eac9a8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ifsym-doc-de \
texlive-ifsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
