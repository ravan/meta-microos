SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "python310-testsuite-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "be81ed01e1ad3630855fb3ac16a0dfa818f4635fc7120767c765ed2852cc31e649b26a3072ce5660cdd29e61ee18b95721cdcc427b64473de805c7b099f3371f"

RPROVIDES:${PN} += "python310-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python310 \
python310-tk"

inherit rpm
