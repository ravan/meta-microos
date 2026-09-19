SUMMARY = "French (français) Dictionary for Aspell"
DESCRIPTION = "A French (français) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.3"

RPM_NAME = "aspell-fr-0.50.3-4.7.aarch64.rpm"
RPM_HASH = "b503bbc525ec092a55b25fa088d40c1339e2e180a77cdeb73c85eb0e753f4e61d7365829522a4f42a93f8e02dd5f53b4e5dd35ec10e26f24aa3082db79c9b126"

RPROVIDES:${PN} += "aspell-fr \
locale-aspell-fr"

RDEPENDS:${PN} += ""

inherit rpm
