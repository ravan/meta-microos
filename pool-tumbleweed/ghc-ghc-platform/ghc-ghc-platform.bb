SUMMARY = "Haskell ghc-platform library"
DESCRIPTION = "This package provides the Haskell ghc-platform library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-platform-0.1.0.0-1.3.aarch64.rpm"
RPM_HASH = "aa0d260b6f2e257388c8ede3afb4d9413a68484566dbcb9d917bbbbbcc156dfba5967b1511d1dd5c4d06e250557d9e2ec3b508ccc17d642ae2a59d7721163f00"

RPROVIDES:${PN} += "ghc-ghc-platform \
libHSghc-platform-0.1.0.0-ac24-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
