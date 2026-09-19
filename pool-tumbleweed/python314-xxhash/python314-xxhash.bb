SUMMARY = "Python binding for xxHash"
DESCRIPTION = "xxhash is a Python binding for the xxHash library."
LICENSE = "BSD-2-Clause"

PV = "3.8.0"

RPM_NAME = "python314-xxhash-3.8.0-1.3.aarch64.rpm"
RPM_HASH = "4b7e05ec24dc879b0cf095d8f8ce935a15fd6274456005f418f6e089d6c1d00159d3835f5a726634649bc01da3ca889c4fb17701ce23b43045753f19a50bd666"

RPROVIDES:${PN} += "python3.14dist-xxhash \
python314-xxhash \
python3dist-xxhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxxhash.so.0 \
python-abi"

inherit rpm
