SUMMARY = "Norwegian Nynorsk (Norsk nynorsk) Dictionary for Aspell"
DESCRIPTION = "A Norwegian Nynorsk (Norsk nynorsk) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.11"

RPM_NAME = "aspell-nn-0.50.11-4.7.aarch64.rpm"
RPM_HASH = "ad5fd666ae0570b2e89cc53eebbcb8b2c89e858a89cdce539841a5cf35442ffa9938b13126f7e9c935ace870c1d6d94ed52464bec6d212b90f684dbfe8d452e1"

RPROVIDES:${PN} += "aspell-nn \
locale-aspell-nn"

RDEPENDS:${PN} += ""

inherit rpm
