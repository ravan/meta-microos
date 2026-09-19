SUMMARY = "LADSPA blepvco plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
blepvco plugins for three anti-aliased, minBLEP-based, hard-sync-capable \
oscillator plugins."
LICENSE = "GPL-2.0+"

PV = "0.1.0"

RPM_NAME = "ladspa-blepvco-0.1.0-4.34.aarch64.rpm"
RPM_HASH = "e7ba24f59c057597a27300ea8756aa58ebb1c0d01d6d4987e1136936b1c9a1ff9f238350b7103e2cec3f8750ddc59a0037c5dec90a4be8554fde8e88f156c1ae"

RPROVIDES:${PN} += "ladspa-blepvco"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
