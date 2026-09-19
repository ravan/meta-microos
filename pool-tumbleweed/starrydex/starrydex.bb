SUMMARY = "Pokédex application for the COSMIC desktop"
DESCRIPTION = "A Pokedex which can work offline (after initialization)."
LICENSE = "GPL-3.0-only"

PV = "0.3.7"

RPM_NAME = "starrydex-0.3.7-1.2.aarch64.rpm"
RPM_HASH = "9b6f5583c30112eec25e8d3ec1b1278003311c0b21fc53e969c5e984fb4e6134c88d30339bb7a56ad0f3d9a25d58665d345020ec653555ecea03ab616b36adc9"

RPROVIDES:${PN} += "starrydex"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
