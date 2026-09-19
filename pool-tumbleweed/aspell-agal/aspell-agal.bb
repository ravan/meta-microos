SUMMARY = "Galician-portuguese (galego-portugués) Dictionary for Aspell"
DESCRIPTION = "A Galician-portuguese (galego-portugués) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "aspell-agal-0.50.0-4.7.aarch64.rpm"
RPM_HASH = "e64eacc6a342347f6f6e23c3d82ffc64e09ee3a5d1ee73f4bd84e6f03ee57d7e6921900fb01d52ad3e2eb1e1078aefeb0e64d7a3163e0a2261f451dc51a33221"

RPROVIDES:${PN} += "aspell-agal \
locale-aspell-gl"

RDEPENDS:${PN} += ""

inherit rpm
