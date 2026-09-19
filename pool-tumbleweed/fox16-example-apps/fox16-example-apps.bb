SUMMARY = "Example applications for the FOX GUI toolkit"
DESCRIPTION = "The example-apps package contains executables for several FOX-based \
applications, including: \
 \
* Adie : Programmer's Text Editor \
 \
* calculator : Calculator Applet \
 \
* shutterbug : Screenshot Utility \
 \
* PathFinder : File Browser"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-example-apps-1.6.57-4.14.aarch64.rpm"
RPM_HASH = "a3fc8815b55b67d0e88761960c30fefe33aa62d3df4c02b9a246a2e3214a428a6d29e7515bbfe3fd458858397e2173555b301fafbafba4e8fd45bc041d050405"

RPROVIDES:${PN} += "fox-example-apps \
fox16-example-apps"

RDEPENDS:${PN} += "libFOX-1.6.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
