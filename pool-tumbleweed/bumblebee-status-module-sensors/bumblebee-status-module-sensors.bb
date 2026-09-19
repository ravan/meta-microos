SUMMARY = "Widget for sensors"
DESCRIPTION = "Displays sensors information."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-sensors-2.1.5-4.7.noarch.rpm"
RPM_HASH = "d4047c16cab1a865995f82677bc99f80b9228568e9684ff512c538f3e19228158e1ce4404d5377154861d3e81012550ddf570df902e17d7a7d99523ba6798d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-sensors"

RDEPENDS:${PN} += "bumblebee-status \
sensors"

inherit rpm
