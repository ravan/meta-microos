SUMMARY = "Language-neutral NUMBERTEXT and MONEYTEXT functions"
DESCRIPTION = "Language-neutral NUMBERTEXT and MONEYTEXT functions for LibreOffice Calc"
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-1_0-0-1.0.11-1.14.aarch64.rpm"
RPM_HASH = "3fa4daa263c7cfdba87f365c4d8ac5c373888ac65d80aec4fd96a14793a6d21271e5b5192b9e3a4db0c64adaca02c424258f5ac4c20ecb0704a47feb02018548"

RPROVIDES:${PN} += "libnumbertext-1-0-0 \
libnumbertext-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnumbertext-data \
libstdc++.so.6"

inherit rpm
