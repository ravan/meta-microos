SUMMARY = "The Linux Audio Developer's Simple Plug-In API"
DESCRIPTION = "The Linux Audio Developer's Simple Plug-in API (LADSPA) provides the \
ability to write simple plug-in audio processors in C/C++ and link them \
dynamically.  This package contains the plugins built from LADSPA SDK."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17"

RPM_NAME = "ladspa-1.17-1.20.aarch64.rpm"
RPM_HASH = "21eb947568f11f1827de599a640b520db4cd25c58548e1bca480fe6291db957796beea1518bc956a829bc83ddefa6ca0a87f34b579f398539b0760103cd01649"

RPROVIDES:${PN} += "ladspa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
