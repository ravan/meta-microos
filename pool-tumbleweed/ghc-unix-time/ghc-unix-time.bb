SUMMARY = "Unix time parser/formatter and utilities"
DESCRIPTION = "Fast parser/formatter/utilities for Unix time."
LICENSE = "BSD-3-Clause"

PV = "0.4.17"

RPM_NAME = "ghc-unix-time-0.4.17-1.8.aarch64.rpm"
RPM_HASH = "ce139b347d39548d056fc1de29ebbe085d7f92ac3dd97c49ee012585a1be6ff300d373bab8c61f4802f1d80b69f801e0762de0dc48de71e31c44c68138ddf039"

RPROVIDES:${PN} += "ghc-unix-time \
libHSunix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSold-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5-ghc9.12.4.so \
libHSold-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
