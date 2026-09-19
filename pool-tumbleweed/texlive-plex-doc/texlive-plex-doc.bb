SUMMARY = "Documentation for texlive-plex"
DESCRIPTION = "This package includes the documentation for texlive-plex"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-plex-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "5c681a667d5eef4179340d268bab6377839f1ea7d4c5e2da58c9d716699b298e5b48100ec24b121caf991e91a3083833e6fd6021864f261b5da266afdb58a153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plex-doc"

RDEPENDS:${PN} += ""

inherit rpm
