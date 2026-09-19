SUMMARY = "LADSPA FIL-plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin to implement four-band parametric equaliser.  Each section has \
an active/bypass switch, frequency, bandwidth and gain controls. There \
is also a global bypass switch and gain control."
LICENSE = "GPL-2.0+"

PV = "0.3.0"

RPM_NAME = "ladspa-FIL-0.3.0-4.35.aarch64.rpm"
RPM_HASH = "b92025297fa058c24cbcd0dda4fe85ba11a6e26bf3af97a9d706be6d3e52de5e655b57975a352ceb72ca0e857bb10924340703771d3213a9553ab664622151fc"

RPROVIDES:${PN} += "ladspa-FIL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
