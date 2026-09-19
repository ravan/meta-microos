SUMMARY = "Widget for each connected screen and allows the user to enable/disable screens"
DESCRIPTION = "Shows a widget for each connected screen and allows the user to enable/disable screens."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-xrandr-2.1.5-4.7.noarch.rpm"
RPM_HASH = "556f57a63758a8285e1a265e9b2b13a5bb66bfae7fca750607c0bebff7f9cf62647e44e4829189b06449e0d979065a3a3655c3ff938daa7e49587bb9b34868e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-xrandr"

RDEPENDS:${PN} += "/usr/bin/bash \
bumblebee-status \
xrandr"

inherit rpm
