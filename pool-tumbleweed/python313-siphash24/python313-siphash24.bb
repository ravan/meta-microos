SUMMARY = "Streaming-capable SipHash-1-3 and SipHash-2-4 implementation"
DESCRIPTION = "A Python wrapper for the SipHash-1-3 and SipHash-2-4 pseudo-random \
functions, providing a streaming-capable interface compatible with \
the hashlib hash objects of the Python standard library."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "1.9"

RPM_NAME = "python313-siphash24-1.9-1.1.aarch64.rpm"
RPM_HASH = "9f7d534cbf448a0833c0b8af4ba07df1c6776807b9714cbe380293ce145a24264c4da5f3f2a0e9fdd394600d00467246224562db98ace95eb6f0149ac20f1bfa"

RPROVIDES:${PN} += "python3-siphash24 \
python3.13dist-siphash24 \
python313-siphash24 \
python3dist-siphash24"

RDEPENDS:${PN} += "libc.so.6 \
python-abi"

inherit rpm
