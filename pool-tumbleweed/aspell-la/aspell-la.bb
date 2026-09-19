SUMMARY = "Latin (latine) Dictionary for Aspell"
DESCRIPTION = "A Latin (latine) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20020503"

RPM_NAME = "aspell-la-20020503-4.7.aarch64.rpm"
RPM_HASH = "7e11239e9815162fa0f3be76893178778e34b3e17bd06bd3b2e8696943a106e70e4e869fd7348fc730be60969ab9e13b3e01372bd4850db21095ce11567fc737"

RPROVIDES:${PN} += "aspell-la \
locale-aspell-la"

RDEPENDS:${PN} += ""

inherit rpm
