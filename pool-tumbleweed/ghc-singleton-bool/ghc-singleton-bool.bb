SUMMARY = "Type level booleans"
DESCRIPTION = "Type level booleans. \
 \
'singletons' package provides similar functionality, but it has tight \
dependency constraints."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-singleton-bool-0.1.8-3.2.aarch64.rpm"
RPM_HASH = "7f6a9580eab32bf2404ca08c90b3119b8e8ec5068f4781c74bfa0476fa00b0b91a573010d2e3ba03f500d125995b65d8a50cb67f79109667d709dd21339f912a"

RPROVIDES:${PN} += "ghc-singleton-bool \
libHSsingleton-bool-0.1.8-HY7gfyx2MgbLc4ChWl2rDv-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSboring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw-ghc9.12.4.so \
libHSdec-0.0.6-9n55jO9wFkCDcYlO4DYA9w-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsome-1.0.6-8u6QsVxyLEPKKVYkZL0j6j-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
