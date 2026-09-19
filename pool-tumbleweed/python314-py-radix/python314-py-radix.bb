SUMMARY = "Radix tree implementation"
DESCRIPTION = "Implements the radix tree data structure for the storage and \
retrieval of IPv4 and IPv6 network prefixes. \
 \
The radix tree is commonly used for routing table lookups. It efficiently \
stores network prefixes of varying lengths and allows fast lookups of \
containing networks. \
 \
This package includes the C-extension."
LICENSE = "BSD-4-Clause & ISC"

PV = "0.10.0"

RPM_NAME = "python314-py-radix-0.10.0-5.7.aarch64.rpm"
RPM_HASH = "ab6da71cba265ae285606cf157142883e519ed5127012392701e454728658f1eec3c417b521b3a4397879db0e5435b602da5bc071dee120eb27056602caa9458"

RPROVIDES:${PN} += "python3.14dist-py-radix \
python314-py-radix \
python3dist-py-radix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
