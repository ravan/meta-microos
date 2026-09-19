SUMMARY = "A Library for Support Vector Machines"
DESCRIPTION = "LIBSVM is an integrated software for support vector classification, \
(C-SVC, nu-SVC), regression (epsilon-SVR, nu-SVR) and distribution \
estimation (one-class SVM). It supports multi-class classification."
LICENSE = "BSD-3-Clause"

PV = "3.36"

RPM_NAME = "libsvm4-3.36-1.6.aarch64.rpm"
RPM_HASH = "e2fb69bc4542a2ccb6014222a0aa952e37288c97f0f1e6bb8710ed8a401e9898f6890a44b536ae6b787484ab817f431835af7f0ce0d42146c27fada760d18029"

RPROVIDES:${PN} += "libsvm.so.4 \
libsvm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
