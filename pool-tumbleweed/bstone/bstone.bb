SUMMARY = "A source port of Blake Stone"
DESCRIPTION = "A source port of the first-person shooter Blake Stone. \
 \
Features: \
 *  High resolution rendering of world (extended vanilla engine) \
 *  Modern and vanilla controls \
 *  Allows to customize control bindings \
 *  Separate volume control of sound effects and music \
Supported games: \
 *  Aliens of Gold (v1.0/v2.0/v2.1/v3.0) full or shareware \
 *  Planet Strike (v1.0/v1.1) \
 \
NOTE: To play Blake Stone with bstone you need the original game files \
You need to start the game from within the folder with these files."
LICENSE = "GPL-2.0-or-later & MIT & GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "bstone-1.3.4-1.2.aarch64.rpm"
RPM_HASH = "500a1f1edb560f9912e73b7b6df00518b35cb322fea85be52d9e18bac2b2145e97a76ae7ad9e57b28846634af935082025c47570d690068abe7c7208bb17b2dd"

RPROVIDES:${PN} += "bstone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
