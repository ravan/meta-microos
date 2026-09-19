SUMMARY = "Thin Python bindings to de/compression algorithms in Rust"
DESCRIPTION = "Extremely thin Python bindings to de/compression algorithms in Rust. \
Allows for using algorithms such as Snappy, without any system dependencies."
LICENSE = "MIT"

PV = "2.12.1"

RPM_NAME = "python314-cramjam-2.12.1-1.1.aarch64.rpm"
RPM_HASH = "07f0eb4d593e7ba442a5eb5de1d97786ea3bf9d02df896a40d4c2bb3f8e45859bef9ea5d67a61361ca9421ffa46a2c441334e8919255f7b36de1eecfa9f12a5f"

RPROVIDES:${PN} += "python3.14dist-cramjam \
python314-cramjam \
python3dist-cramjam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libisal.so.2 \
libm.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
