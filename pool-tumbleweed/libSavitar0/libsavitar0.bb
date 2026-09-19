SUMMARY = "3D printer control software"
DESCRIPTION = "libSavitar is a C++ implementation of 3mf loading with SIP python bindings."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libSavitar0-4.13.1-3.5.aarch64.rpm"
RPM_HASH = "b2fb404a4d0fb9c378df6f133e659ccf7e8d71d2da0deba173719db456cf4667dd4da75fee538b9fe2e9a9de9b6c6a93eadfab5f084c4418e9fe656bff176033"

RPROVIDES:${PN} += "libSavitar.so.0 \
libSavitar0 \
python3-Savitar"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpugixml.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm
