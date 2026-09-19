SUMMARY = "A class for types with a default value"
DESCRIPTION = "This module defines a class for types with a default value. Instances are \
provided for '()', 'Data.Set.Set', 'Data.Map.Map', 'Int', 'Integer', 'Float', \
'Double', and many others."
LICENSE = "BSD-3-Clause"

PV = "0.8.0.2"

RPM_NAME = "ghc-data-default-0.8.0.2-1.3.aarch64.rpm"
RPM_HASH = "bbd13cf82e17d03fecc1319266f2d36724fa3ee748af448ea89c666fb9a339a86f7708b86f95c62b48a610d11816942d233e9a4aada3064349f3dd67d600a07c"

RPROVIDES:${PN} += "ghc-data-default \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
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
