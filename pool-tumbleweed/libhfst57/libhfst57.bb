SUMMARY = "Helsinki Finite-State Transducer C++ API Library"
DESCRIPTION = "The Helsinki Finite-State Transducer software is intended for the \
implementation of morphological analyzers and other tools which are \
based on weighted and unweighted finite-state transducer technology."
LICENSE = "GPL-3.0-only"

PV = "3.17.3"

RPM_NAME = "libhfst57-3.17.3-1.1.aarch64.rpm"
RPM_HASH = "ca239f7a981fb5ed6048b8bc7d6c39dccfdf636490ae39f2e2a7913fc2635b7ce62ab7509c1c46516580daa065b7c970dfc8b063288b153e80ce9d9bc8704f9e"

RPROVIDES:${PN} += "libhfst.so.57 \
libhfst57"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfoma.so.0 \
libfst.so.26 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
