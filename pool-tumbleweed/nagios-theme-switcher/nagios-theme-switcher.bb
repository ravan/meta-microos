SUMMARY = "Simple Theme Switcher for Nagios Webfrontend"
DESCRIPTION = "This package contains a simple script with configures Nagios to use \
a theme below /usr/share/nagios."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "nagios-theme-switcher-1.4-2.23.noarch.rpm"
RPM_HASH = "3b5e49a84fcbfc498cd5171ac1ca253e34267de23a7207a7fcfef2c4d76acbb413d1e25c0b18ed9eac125e151c73abf41e7feb865d93b194a3abeac2fef5c736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nagios-theme-switcher"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
