SUMMARY = "Shared library for CLHEP Evaluator"
DESCRIPTION = "This package provides the CLHEP Evaluator shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-Evaluator-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "3ba0dc1c8a9d054d4b45f1f90238cf242626d99bee84fd9b214984837bedddc2715945d5e1fca224733112be088fd4590b3092e7763beb75e6d692559711ac25"

RPROVIDES:${PN} += "libCLHEP-Evaluator-2-4-7-2 \
libCLHEP-Evaluator-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
