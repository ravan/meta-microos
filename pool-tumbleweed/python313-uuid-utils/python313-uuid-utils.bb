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

RPM_NAME = "python313-uuid-utils-0.14.1-1.5.aarch64.rpm"
RPM_HASH = "0b4346bd73181a63efb5ae914cd61ab684e358142ebdc1b5998c35371272513ee5992ffa40ce55897084368406c28881c9331ee13c61eaa41e77f58840f14c5d"

RPROVIDES:${PN} += "python3-uuid-utils \
python3.13dist-uuid-utils \
python313-uuid-utils \
python3dist-uuid-utils"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
