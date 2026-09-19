SUMMARY = "Missing bits for non Yuga Linux systems"
DESCRIPTION = "Missing bits for non Yuga Linux systems with basic binaries called by Steam."
LICENSE = "MIT"

PV = "1+git20250418.7104815"

RPM_NAME = "gamescope-session-steam-generic-1+git20250418.7104815-1.4.noarch.rpm"
RPM_HASH = "02bdc70063e71a2d7bf37d990b68e1a1661f331dbcc41a52dc4fe14672e84d6be0acbf9302e10a1902cecc07a671c7e08403e691d0ca7d622f199365cb091d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gamescope-session-steam-generic"

RDEPENDS:${PN} += "/usr/bin/bash \
gamescope-session-steam"

inherit rpm
