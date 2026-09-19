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

RPM_NAME = "python313-py-radix-0.10.0-5.7.aarch64.rpm"
RPM_HASH = "729587c96bb57e91886ba5cd40735f997a37f96598b3840b703bf0e74d967192291a7213d3cbabb77b00922aea6bc4c8e20bbfb9068ebe547d82a02c1f7d1875"

RPROVIDES:${PN} += "python3-py-radix \
python3.13dist-py-radix \
python313-py-radix \
python3dist-py-radix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
