SUMMARY = "Welsh (Cymraeg) Dictionary for Aspell"
DESCRIPTION = "A Welsh (Cymraeg) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.3"

RPM_NAME = "aspell-cy-0.50.3-4.7.aarch64.rpm"
RPM_HASH = "9893541272d2f00e8906efad30aadc43ecc55ae1fb1714357af28d3c2cdfe866ed5a06678b124f4c823a7f8bd2d33b2ddb475b647cf49a8bd006b21c57d68f0a"

RPROVIDES:${PN} += "aspell-cy \
locale-aspell-cy"

RDEPENDS:${PN} += ""

inherit rpm
