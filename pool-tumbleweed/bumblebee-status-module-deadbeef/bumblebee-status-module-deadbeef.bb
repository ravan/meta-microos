SUMMARY = "Widget for deadbeef"
DESCRIPTION = "Displays the current song being played in DeaDBeeF and provides \
some media control bindings."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-deadbeef-2.1.5-4.7.aarch64.rpm"
RPM_HASH = "dc1b43899b98368cccbd3087e448402876485094872b919884d94970bd8cb121df6e8bdc26b09f0c4c0ce82b9f74fd4f7d04ef09398c0ac8c62ad8366da6baf3"

RPROVIDES:${PN} += "bumblebee-status-module-deadbeef"

RDEPENDS:${PN} += "bumblebee-status \
deadbeef"

inherit rpm
