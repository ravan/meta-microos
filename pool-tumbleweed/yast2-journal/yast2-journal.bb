SUMMARY = "YaST2 - Reading of systemd journal"
DESCRIPTION = "A YaST2 module to read the systemd journal in a convenient and \
user-friendly way."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.0.3"

RPM_NAME = "yast2-journal-5.0.3-1.2.noarch.rpm"
RPM_HASH = "7e677516ef19ed191ec837a151cee924b3c671a078258cc0e1587c5239b35257d92511bad66c1429029c57a9cf7fe8b069761158ba32e5b576c15c297d840d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-journal"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
