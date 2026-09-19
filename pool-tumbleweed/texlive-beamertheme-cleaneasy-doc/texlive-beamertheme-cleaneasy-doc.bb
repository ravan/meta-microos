SUMMARY = "Documentation for texlive-beamertheme-cleaneasy"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-cleaneasy"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0.3svn74971"

RPM_NAME = "texlive-beamertheme-cleaneasy-doc-2026.226.1.0.3svn74971-61.2.noarch.rpm"
RPM_HASH = "2c316add43ea497182b0fec08a5c5252257cc355946aeac4e8c5ace1e7b07ddf8c28189de1cfe3db7f7c0dc228e31ac084c17e97b250d348222d58c3b6459163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-cleaneasy-doc"

RDEPENDS:${PN} += ""

inherit rpm
