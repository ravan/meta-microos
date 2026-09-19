SUMMARY = "Fast, drop-in replacement for Python's uuid module, powered by Rust"
DESCRIPTION = "Fast, drop-in replacement for Python's uuid module, powered by Rust. \
 \
Available UUID versions: \
 \
- uuid1 - Version 1 UUIDs using a timestamp and monotonic counter. \
- uuid3 - Version 3 UUIDs based on the MD5 hash of some data. \
- uuid4 - Version 4 UUIDs with random data. \
- uuid5 - Version 5 UUIDs based on the SHA1 hash of some data. \
- uuid6 - Version 6 UUIDs using a timestamp and monotonic counter. \
- uuid7 - Version 7 UUIDs using a Unix timestamp ordered by time. \
- uuid8 - Version 8 UUIDs using user-defined data."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python314-uuid-utils-0.14.1-1.5.aarch64.rpm"
RPM_HASH = "bf4ad655b155bf7235010605af673d46c79416983a28750be52e29abc045fc115e48a2ad945aa5b6870785631e0434a443e57df019aa65718f1513f74988bc56"

RPROVIDES:${PN} += "python3.14dist-uuid-utils \
python314-uuid-utils \
python3dist-uuid-utils"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
