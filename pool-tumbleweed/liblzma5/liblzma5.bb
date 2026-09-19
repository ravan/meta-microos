SUMMARY = "Lempel–Ziv–Markov chain algorithm compression library"
DESCRIPTION = "Library for encoding/decoding LZMA files."
LICENSE = "0BSD"

PV = "5.8.3"

RPM_NAME = "liblzma5-5.8.3-1.3.aarch64.rpm"
RPM_HASH = "a986679fecebc93e115722ea250de6971aeb8485c6eeba7e2074b6de3f23cc7aedf20adb7067a13b181653cdd3d58c5e7ad20d4d6e66a5aa2cc5df68cb2202ea"

RPROVIDES:${PN} += "liblzma.so.5 \
liblzma5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
