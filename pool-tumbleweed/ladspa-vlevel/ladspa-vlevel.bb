SUMMARY = "LADSPA vlevel plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin and a tool to amplify the soft parts of music so you don't have to \
fiddle with the volume control."
LICENSE = "GPL-2.0+"

PV = "0.5"

RPM_NAME = "ladspa-vlevel-0.5-4.39.aarch64.rpm"
RPM_HASH = "1660fbb0b03936cf222f3e4d8d337513d239ad92bacab31aa36e0207baa4a7b10f71bc9b82f068aa28797d704e5503ab6e546ba069125b6bd7e4336a776efee9"

RPROVIDES:${PN} += "ladspa-vlevel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
