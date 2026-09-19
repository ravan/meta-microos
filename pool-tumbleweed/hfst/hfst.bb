SUMMARY = "Helsinki Finite-State Transducer Technology"
DESCRIPTION = "The Helsinki Finite-State Transducer software is intended for the \
implementation of morphological analyzers and other tools which are \
based on weighted and unweighted finite-state transducer technology."
LICENSE = "Apache-2.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & GPL-3.0-only"

PV = "3.17.3"

RPM_NAME = "hfst-3.17.3-1.1.aarch64.rpm"
RPM_HASH = "582b601430e635a11eeb94b047de632f9d90f9dc426cbc739973b5336f5673bcbe564afad0350d1bab9b82114ae8fd96d85368d32d74cd958d8d8d63dee31210"

RPROVIDES:${PN} += "hfst"

RDEPENDS:${PN} += "grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhfst.so.57 \
libicuuc.so.78 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
sed"

inherit rpm
