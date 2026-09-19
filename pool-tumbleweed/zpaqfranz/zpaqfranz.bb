SUMMARY = "A journaling, incremental, deduplicating archiver"
DESCRIPTION = "Swiss army knife for backup and disaster recovery, like 7z or RAR on \
steroids,with deduplicated 'snapshots' (versions). Conceptually similar to Mac \
time machine, but much more efficiently."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & SUSE-Public-Domain & Zlib & Unlicense & Ferguson-Twofish"

PV = "64.8"

RPM_NAME = "zpaqfranz-64.8-1.1.aarch64.rpm"
RPM_HASH = "fb5c6b5ab54fdcf3e0f82fa9be7300eb6f32152f27416984707d297a5c371cb5df27570e8ee97e43880414907d73ff947a70a6f1485d771ffc0996db46e0c5c5"

RPROVIDES:${PN} += "bundled-blake3 \
bundled-highwayhash \
bundled-libdivsufsort-lite \
bundled-lz4 \
bundled-xxhash \
zpaqfranz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
