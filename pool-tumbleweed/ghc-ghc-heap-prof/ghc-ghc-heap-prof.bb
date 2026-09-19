SUMMARY = "Haskell ghc-heap profiling library"
DESCRIPTION = "This package provides the Haskell ghc-heap profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-heap-prof-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "06ed122a521785b6ce3a829eaf46e3eab2bbe9f285a49371ef36b68c66c9af914ba3c91033841f119a6ce29340fabbb0e35b057031b56e8d64347dc9a8869457"

RPROVIDES:${PN} += "ghc-ghc-heap-prof \
ghc-prof-ghc-heap-9.12.4-167c \
libHSghc-heap-9.12.4-167c-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-ghc-heap-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-ghc-internal-9.1204.0-f1e1 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-rts-1.0.3 \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHScontainers-0.7-d5e1-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
