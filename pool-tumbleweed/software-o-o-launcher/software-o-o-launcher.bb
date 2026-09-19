SUMMARY = "A menu item for software.opensuse.org service"
DESCRIPTION = "Many users struggle to find additional software outside of the openSUSE distributions. Our https://software.opensuse.org does a great job at it, however, not everyone is aware of its \
existence. This quick launcher provides a menu launcher for software-o-o webservice with the intention \
to bring the service closer to the user."
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "software-o-o-launcher-1.0-1.11.aarch64.rpm"
RPM_HASH = "baf74d8a1d163b2b20b1217ede847a76f6a8fcaff438642cf184a2b7e0e0509649f906e46b9897a25a0797fa3eae22800f4da82fedc17f2a4d442c744e413013"

RPROVIDES:${PN} += "software-o-o-launcher"

RDEPENDS:${PN} += "/usr/bin/sh \
update-desktop-files \
xdg-utils"

inherit rpm
