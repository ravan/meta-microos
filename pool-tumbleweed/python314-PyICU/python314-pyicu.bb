SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.16.2"

RPM_NAME = "python314-PyICU-2.16.2-1.4.aarch64.rpm"
RPM_HASH = "ff81b2b52665467ba7dda18be4c13cf5ab48a72f962ecc06a81896d4fa0e41e60e4eb996dd26c637acf158900515937be8583a17b96cef772dd3f9bf68b0fdfa"

RPROVIDES:${PN} += "PyICU \
python3.14dist-pyicu \
python314-ICU \
python314-PyICU \
python3dist-pyicu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libstdc++.so.6 \
python-abi"

inherit rpm
