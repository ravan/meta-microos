SUMMARY = "Scientific-grade astronomy routines for Python"
DESCRIPTION = "PyEphem provides an ephem Python package for performing high-precision astronomy computations."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python314-ephem-4.2.1-2.3.aarch64.rpm"
RPM_HASH = "7d97247eb606b2df89b56697904c93e5441d5dd90fe50fc8ae6baa27b349d52ff155e48249bb02292207527eccfe9eaab612fc53d687f837765cb5666928f1e2"

RPROVIDES:${PN} += "python3.14dist-ephem \
python314-ephem \
python3dist-ephem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi"

inherit rpm
