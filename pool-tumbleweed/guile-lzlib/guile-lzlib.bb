SUMMARY = "Guile bindings to lzlib"
DESCRIPTION = "This package provides Guile bindings to lzlib, a data compression library \
providing in-memory LZMA compression and decompression."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.2"

RPM_NAME = "guile-lzlib-0.0.2-1.20.aarch64.rpm"
RPM_HASH = "438921262e1c8d74863c02f49df3ee3f68eb437c29061397082f833e603affd7363d5ecfcc7cc82f278ec6a494464c658e013649f88a02063f761edec93bc433"

RPROVIDES:${PN} += "guile-lzlib"

RDEPENDS:${PN} += "guile \
lzlib-devel"

inherit rpm
