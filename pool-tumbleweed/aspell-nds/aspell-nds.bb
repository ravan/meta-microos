SUMMARY = "Low Saxon (Plattdüütsch) Dictionary for Aspell"
DESCRIPTION = "A Low Saxon (Plattdüütsch) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.01"

RPM_NAME = "aspell-nds-0.01-4.7.aarch64.rpm"
RPM_HASH = "ea6e992f0b73c21083f2e5fe66ecae068bc7a5699efe518284339dc44d8b757974206947126144eab5c4a13068524c50e1cee6e302256eabc26953086b415203"

RPROVIDES:${PN} += "aspell-nds \
locale-aspell-nds"

RDEPENDS:${PN} += ""

inherit rpm
