SUMMARY = "Widget to show information about the current song in cmus"
DESCRIPTION = "Displays information about the current song in cmus via cmus-remote. \
 \
It takes a parameter (cmus.format) which customizes how the song \
is displayed. Tag values can be put in curly brackets, (i.e., {artist})."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-cmus-2.1.5-4.7.noarch.rpm"
RPM_HASH = "bb10e216f4fe3239f6de0fabe1955b2d94b24b69dfa77d6c2a55dad3a73776a501dd8e707a6fe6922e1659d00085143d6d06eaeecef6460885e3392cdc7f322c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-cmus"

RDEPENDS:${PN} += "bumblebee-status \
cmus"

inherit rpm
