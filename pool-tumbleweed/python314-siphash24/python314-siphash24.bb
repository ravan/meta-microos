SUMMARY = "Streaming-capable SipHash-1-3 and SipHash-2-4 implementation"
DESCRIPTION = "A Python wrapper for the SipHash-1-3 and SipHash-2-4 pseudo-random \
functions, providing a streaming-capable interface compatible with \
the hashlib hash objects of the Python standard library."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "1.9"

RPM_NAME = "python314-siphash24-1.9-1.1.aarch64.rpm"
RPM_HASH = "3226c2bb00ef24f8b2e9fb0f2850d80d7094107460c1d260bf27efbe32bb0a4941d57a072234be776fe6f1c0865b7a241dd5ee62e58daf90cbe75c09ef7afd23"

RPROVIDES:${PN} += "python3.14dist-siphash24 \
python314-siphash24 \
python3dist-siphash24"

RDEPENDS:${PN} += "libc.so.6 \
python-abi"

inherit rpm
