SUMMARY = "Setswana Dictionary for Aspell"
DESCRIPTION = "A Setswana dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "aspell-tn-1.0.1-4.7.aarch64.rpm"
RPM_HASH = "c8332d2b83e02bc22f80f31f2c21aa1b41bfa5968a96ba66865f19251544bdb525b91c9b4c4593c22cd75bd83fb41e306bec2be30f7a78893e57600d37aa051a"

RPROVIDES:${PN} += "aspell-tn \
locale-aspell-tn"

RDEPENDS:${PN} += ""

inherit rpm
