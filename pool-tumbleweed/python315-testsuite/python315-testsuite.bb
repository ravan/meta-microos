SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-testsuite-3.15.0~rc2-1.2.aarch64.rpm"
RPM_HASH = "cce29280dae5bf4c7d8ad8113606e3ec370015b698fbb40ea15f487abffc6d6beac1a05fb33e905033ec685ba8d1cbf43a8ce3f6b0295503911f797856917488"

RPROVIDES:${PN} += "python315-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzstd.so.1 \
python-abi \
python315 \
python315-tk"

inherit rpm
