SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "python311-testsuite-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "40d805e1e89c7c691d071e5699bd0de0bb7be56d24f39aa251eb640b9698972f5feffbc6293653a9b876372da3bfa99d98183aec29c7b1923b22bd6ead2b4cd3"

RPROVIDES:${PN} += "python311-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python311 \
python311-tk"

inherit rpm
