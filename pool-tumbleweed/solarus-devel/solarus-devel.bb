SUMMARY = "Development files for solarus"
DESCRIPTION = "Development files for Solarus, including header files."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-devel-1.6.5-3.3.aarch64.rpm"
RPM_HASH = "fd7d51de9e54f0e06e8a776cba07e278778e78b060ab394956ba768e85be1393226fc964af3f1d47ce9c06809db8fd414dced69105e909533625541ee743ab30"

RPROVIDES:${PN} += "solarus-devel"

RDEPENDS:${PN} += "solarus \
solarus-gui"

inherit rpm
