SUMMARY = "Python C module to calculate SipHashes"
DESCRIPTION = "A Python C module for siphash. SipHash is an add–rotate–xor (ARX) \
based family of pseudorandom functions. \
 \
SipHash is fundamentally different from cryptographic hash functions \
like SHA in that SipHash is only suitable as a message authentication \
code."
LICENSE = "ISC"

PV = "2.8"

RPM_NAME = "python314-siphashc-2.8-1.1.aarch64.rpm"
RPM_HASH = "9c446888ff479084dd71370b9865e67bd250e81e734b0faac274d5340f3ebc4f71112a4164eb49d11420659dec75118650ccb1d54db8072b74e4d316f789a610"

RPROVIDES:${PN} += "python3.14dist-siphashc \
python314-siphashc \
python314-siphashc3 \
python3dist-siphashc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
