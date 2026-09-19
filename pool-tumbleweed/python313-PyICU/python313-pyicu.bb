SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.16.2"

RPM_NAME = "python313-PyICU-2.16.2-1.4.aarch64.rpm"
RPM_HASH = "c6839d51b6e2458be1b6dc17b8ea81d11fd994ebaf350bc6b5c9f0872c01d16024bf2c37437f6abd533267c98a33e95e44c2021423c602828d7ec000fb3e9198"

RPROVIDES:${PN} += "PyICU \
python3-ICU \
python3-PyICU \
python3.13dist-pyicu \
python313-ICU \
python313-PyICU \
python3dist-pyicu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libstdc++.so.6 \
python-abi"

inherit rpm
