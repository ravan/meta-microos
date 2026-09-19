SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "python313-testsuite-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "5d23b94591291a4d8f1885ea1cb7305905bb473042d6626dc09e725f26c8764af60bbf3857910223860e4573427fafdd48ceb2ec4d3653835c23a80b09e0e4f9"

RPROVIDES:${PN} += "python3-testsuite \
python313-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python313 \
python313-tk"

inherit rpm
