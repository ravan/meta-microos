SUMMARY = "Documentation for texlive-mp3d"
DESCRIPTION = "This package includes the documentation for texlive-mp3d"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.34svn29349"

RPM_NAME = "texlive-mp3d-doc-2026.226.1.34svn29349-61.2.noarch.rpm"
RPM_HASH = "7012252694f35bd16a1fb926b7a8a7d8e1d27aa9496493710577bb1134d038247af59a2108f1bc49539000c74f7da851f4f8d5e5d0e8307366a6754dc8df5197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mp3d-doc-fr;en \
texlive-mp3d-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
