SUMMARY = "Galician Gaelic (galego) Dictionary for Aspell"
DESCRIPTION = "A Galician Gaelic (galego) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-only"

PV = "0.50a"

RPM_NAME = "aspell-gl-0.50a-4.7.aarch64.rpm"
RPM_HASH = "915b3616d7e79a317a5715d8f95b01d0f29d435a95e9bfae1481f91e9bdf4c704d88075b7d27ae33c3925788a40728af1146cf06f5b3ebc6e70025e1d6c8de52"

RPROVIDES:${PN} += "aspell-gl \
locale-aspell-gl"

RDEPENDS:${PN} += ""

inherit rpm
