SUMMARY = "Intel Intelligent Storage Acceleration Library"
DESCRIPTION = "ISA-L is a collection of optimized low-level functions targeting \
storage applications. ISA-L includes: \
 \
* Erasure codes: Block Reed-Solomon type erasure codes for any \
  encode/decode matrix in GF(2^8). \
* CRC Implementations of cyclic redundancy check. Six different \
  polynomials supported: iscsi32, ieee32, t10dif, ecma64, iso64, \
  jones64. \
* RAID calculation and operation on XOR and P+Q parity found in \
  common RAID implementations. \
* Compression of deflate-compatible data compression. \
* De-compression of inflate-compatible data compression. \
 \
This package contains the development headers for the library found \
in libisal2."
LICENSE = "BSD-3-Clause"

PV = "2.32.1"

RPM_NAME = "libisal2-2.32.1-1.3.aarch64.rpm"
RPM_HASH = "d792a2f0663a96f50580be7c2a5d5fc521223e0df3d8ac03c2097cbf508cdf4c44ed21a891ba95e49a8fca290e289809c4b1fb7bda40ff3b76482dbffa3fed4d"

RPROVIDES:${PN} += "libisal.so.2 \
libisal2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
