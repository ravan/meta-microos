SUMMARY = "A blocking, shuffling and lossless compression library"
DESCRIPTION = "Blosc is a metacompressor (using actual algorithms like BloscLZ, LZ4, \
LZ4HC, Snappy or Zlib) for binary data, with a focus on reducing \
memory bus activity."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "1.21.6"

RPM_NAME = "libblosc1-1.21.6-3.3.aarch64.rpm"
RPM_HASH = "044e615aa33dd3fbacb2ef61c9447bec09e032366540e4ce0d2ff128a17c3829a41b5f6334777bda18e63457e269be01e391799caa21e5612a924fdb9244eee4"

RPROVIDES:${PN} += "libblosc.so.1 \
libblosc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libsnappy.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
