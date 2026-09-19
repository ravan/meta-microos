SUMMARY = "Scientific-grade astronomy routines for Python"
DESCRIPTION = "PyEphem provides an ephem Python package for performing high-precision astronomy computations."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python313-ephem-4.2.1-2.3.aarch64.rpm"
RPM_HASH = "f8058e63f73d952be7c1b6f159c688213d649c1e63faa2d46341ec0505fcd7b4abc443fc2ccef3de526d332740b824faac680fa273541ec8ffb5b79e09d099ca"

RPROVIDES:${PN} += "python3-ephem \
python3.13dist-ephem \
python313-ephem \
python3dist-ephem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi"

inherit rpm
