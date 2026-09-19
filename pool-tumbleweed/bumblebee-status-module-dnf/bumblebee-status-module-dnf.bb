SUMMARY = "Widget to display DNF package update information"
DESCRIPTION = "Displays DNF package update information (<security>/<bugfixes>/<enhancements>/<other>) \
via dnf. \
 \
It takes a parameter (dnf.interval) which controls the time in seconds \
between two consecutive update checks (default = 30 minutes)"
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-dnf-2.1.5-4.7.noarch.rpm"
RPM_HASH = "476654d0687dde3f70be474054bc3ff2a27c0cf7b3afbdb0f87491d382fda445f084535b6dce024b354fe3691949037abf59e08027e0f9630f8d6ff8d52e8fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-dnf"

RDEPENDS:${PN} += "bumblebee-status \
dnf"

inherit rpm
