SUMMARY = "Parsers and printers for bencoded data"
DESCRIPTION = "Parsers and printers for bencoded data. Bencode (pronounced like B encode) is \
the encoding used by the peer-to-peer file sharing system BitTorrent for \
storing and transmitting loosely structured data."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-0.6.1.1-4.35.aarch64.rpm"
RPM_HASH = "40b6d8b80eebbf194ef103fa20ce7e5fee94b9b4cb5e73cb4cb873b0ee03fa79f98cd6cf938367b6dc05e69eeca3dff27e1efa5610fca2e73edd648704aa9dbb"

RPROVIDES:${PN} += "ghc-bencode \
libHSbencode-0.6.1.1-KWSVkFpNEL1HhwrIArSQND-ghc9.12.4.so"

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
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
