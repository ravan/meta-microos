SUMMARY = "A simple and efficient time library"
DESCRIPTION = "A simple and efficient time library. \
 \
A key part of the library is the `Timeable` and `Time` type classes. \
 \
Types representing time values that are instances of the classes allow easy \
conversion between values of one time type and another."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-time-hourglass-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "e3e0ad6b34e5f5974a651e95d009a5b02488d17825be4c653651249083d90b72d6b54245e9f86696239882f6b82633b0dd35f2b8a85f736f4484a568aea63feb"

RPROVIDES:${PN} += "ghc-time-hourglass \
libHStime-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
