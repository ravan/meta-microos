SUMMARY = "Python C module to calculate SipHashes"
DESCRIPTION = "A Python C module for siphash. SipHash is an add–rotate–xor (ARX) \
based family of pseudorandom functions. \
 \
SipHash is fundamentally different from cryptographic hash functions \
like SHA in that SipHash is only suitable as a message authentication \
code."
LICENSE = "ISC"

PV = "2.8"

RPM_NAME = "python313-siphashc-2.8-1.1.aarch64.rpm"
RPM_HASH = "8edf06b835533dd404964334985f5d0f311a36bd05b12adf9a518e33ccb1cf560ab61f7123f9149fc91a33dd9a82441c355f1b088f139b5f2a308ec9067cff05"

RPROVIDES:${PN} += "python3-siphashc \
python3-siphashc3 \
python3.13dist-siphashc \
python313-siphashc \
python313-siphashc3 \
python3dist-siphashc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
