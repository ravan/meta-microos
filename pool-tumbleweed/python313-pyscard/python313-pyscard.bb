SUMMARY = "Python module adding smart card support"
DESCRIPTION = "Python-pyscard consists of smartcard.scard, an extension module wrapping \
Windows smart card base components (also known as PCSC) on Windows and PCSC \
lite on linux and Mac OS X Tiger and Leopard, and smartcard, a higher level \
python framework built on top of the raw PCSC API."
LICENSE = "LGPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "python313-pyscard-2.3.1-1.7.aarch64.rpm"
RPM_HASH = "07bec64813a0f0da2e20dc1b701f2c465dd0905f7932c8bd23bdfa8822dd74b8d4a9da1b4cddf35c9385ddc9e2e0affa5d79bc3d2a05e8159a25ec605aaee6f1"

RPROVIDES:${PN} += "python3-pyscard \
python3.13dist-pyscard \
python313-pyscard \
python3dist-pyscard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-ccid \
python-abi"

inherit rpm
