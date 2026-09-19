SUMMARY = "Thin Python bindings to de/compression algorithms in Rust"
DESCRIPTION = "Extremely thin Python bindings to de/compression algorithms in Rust. \
Allows for using algorithms such as Snappy, without any system dependencies."
LICENSE = "MIT"

PV = "2.12.1"

RPM_NAME = "python313-cramjam-2.12.1-1.1.aarch64.rpm"
RPM_HASH = "e46028d94b57ac670ca16e9ceb4174bfb83c4b07512526e27684f5969d4dc7eecec7905a428624dbbc3e04f59702a67aa2c4023ba2a3effb88586bcafac444cd"

RPROVIDES:${PN} += "python3-cramjam \
python3.13dist-cramjam \
python313-cramjam \
python3dist-cramjam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libisal.so.2 \
libm.so.6 \
libzstd.so.1 \
python-abi"

inherit rpm
