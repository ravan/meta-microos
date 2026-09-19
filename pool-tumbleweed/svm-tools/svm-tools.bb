SUMMARY = "A set of tools to use with libsvm"
DESCRIPTION = "LIBSVM is an integrated software for support vector classification, \
(C-SVC, nu-SVC), regression (epsilon-SVR, nu-SVR) and distribution \
estimation (one-class SVM). It supports multi-class classification."
LICENSE = "BSD-3-Clause"

PV = "3.36"

RPM_NAME = "svm-tools-3.36-1.6.aarch64.rpm"
RPM_HASH = "8d9c9696ba99702a9485417d24a2656c24fed609b964418b239a4b14824434deb3d29ef6267bfec8a5ded67de5c22281b259f93ae590014a2d43f84ef52f8434"

RPROVIDES:${PN} += "svm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
