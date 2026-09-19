SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-testsuite-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "0de5c4dddd7bcbf7a8144fdce77425518f2b95a468088ebc86d6a2e35cb5d7e42d4767c829ebefe3fa40baa776d00bf626911bdd888c3c8bd149c662dcf483b2"

RPROVIDES:${PN} += "python312-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python312 \
python312-tk"

inherit rpm
