SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "python314-testsuite-3.14.7-1.3.aarch64.rpm"
RPM_HASH = "a2490e571d98c4643061e79dac146249cb7fc3e22c868c38b49bf944cb13f1b6094e2ee9231b672765a28151d36aaf3b769596c175aeb07655764a7465141607"

RPROVIDES:${PN} += "python314-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python314 \
python314-tk"

inherit rpm
