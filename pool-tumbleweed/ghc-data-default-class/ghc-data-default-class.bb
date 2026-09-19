SUMMARY = "A class for types with a default value (compatibility shim)"
DESCRIPTION = "This module re-exports the 'Default' class from 'Data.Default', for \
compatibility with older code."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.0"

RPM_NAME = "ghc-data-default-class-0.2.0.0-1.11.aarch64.rpm"
RPM_HASH = "36c82db27b58def79801443c42cdc82b129409829cd337b3d80ff8cc2be03a9bc4fb5370c5ef2c0f15ef267030310b6808b4fcaeffa7486d7a59d5df92cccdb0"

RPROVIDES:${PN} += "ghc-data-default-class \
libHSdata-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
