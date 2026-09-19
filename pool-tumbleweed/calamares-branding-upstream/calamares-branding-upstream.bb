SUMMARY = "Branding for calamares"
DESCRIPTION = "This package provides configuration files and 'look and feel' for \
Calamares installer. 'Look and feel' files are simplified upstream files. \
Meanwhile configuration files adopted to work with openSUSE and SUSE \
based custom appliances."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.2"

RPM_NAME = "calamares-branding-upstream-3.4.2-1.1.noarch.rpm"
RPM_HASH = "326fe9e5ff9dd057ed6a25a2a72613b087f38f60f6bf485fd1b25d62b04c5ad347d9cb90ff9bc5f8076707bd1e34dec6fd6ac790bbfbb80588b5458201886e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calamares-branding \
calamares-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
