SUMMARY = "Exposes the native endianness or byte ordering of the system"
DESCRIPTION = "This package is for working with the native byte-ordering of the system."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-1.0.4-4.19.aarch64.rpm"
RPM_HASH = "3c69f24f81e3fae68934d8a8d5a65de9c9b5f48b0372520a142a947404c2f9c42759c8bccc7f440b8c81e0e951e5efbc536f2d3d709f9077ec572ddd083fe859"

RPROVIDES:${PN} += "ghc-byteorder \
libHSbyteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
