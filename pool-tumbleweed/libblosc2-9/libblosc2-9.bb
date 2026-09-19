SUMMARY = "A fast, compressed, persistent binary data store library for C"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data \
(i.e. floating point numbers, integers and booleans)."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "3.3.4"

RPM_NAME = "libblosc2-9-3.3.4-1.1.aarch64.rpm"
RPM_HASH = "a88894703156ab5996f71d9d7d35952f3140ec5a4623c3dbaaa5a23861e74314d970a73599bfa8ce46c3fd30da64163101b5e726d2366af1113b60f92aa96715"

RPROVIDES:${PN} += "libblosc2-9 \
libblosc2.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libm.so.6 \
libz.so.1 \
libzfp.so.1 \
libzstd.so.1"

inherit rpm
