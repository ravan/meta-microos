SUMMARY = "Python bindings for GDCM"
DESCRIPTION = "A Python module for interfacing with the GDCM library."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "python3-gdcm-3.2.5-2.3.aarch64.rpm"
RPM_HASH = "45191d6cd14d0a68e9fdcb37a4825a6c65948eb0e395193444d9c144334a45f6e5609b5f6e5ac05b5f5538ef9fa53e57723a5924865ef50acf8b0f60bcbb489c"

RPROVIDES:${PN} += "python3-gdcm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdcm3-2 \
libgdcmCommon.so.3.2 \
libgdcmDICT.so.3.2 \
libgdcmDSED.so.3.2 \
libgdcmIOD.so.3.2 \
libgdcmMEXD.so.3.2 \
libgdcmMSFF.so.3.2 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
