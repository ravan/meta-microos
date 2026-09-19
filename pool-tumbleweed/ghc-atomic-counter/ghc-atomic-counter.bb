SUMMARY = "Mutable counters that can be modified with atomic operatinos"
DESCRIPTION = "This package defines Counter type that can be safely modified concurrently from \
multiple threads. The type supports only few operations, namely read, write, \
cas (compare and swap), add, subtract and a few bitwise ones like or, and xor. \
 \
Most common use case is having a shared counter that multiple threads \
increment. Another potential use case is lightweight locks."
LICENSE = "Apache-2.0"

PV = "0.1.2.4"

RPM_NAME = "ghc-atomic-counter-0.1.2.4-1.9.aarch64.rpm"
RPM_HASH = "1bc4a1822f1735438428ec0038c7bc715301e2c722fad9ed3b5844001422ca8cfcac1b6381c0653c3fe20170dfb74984e074c8551050365b7dfb8b6c6ddf9fec"

RPROVIDES:${PN} += "ghc-atomic-counter \
libHSatomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
