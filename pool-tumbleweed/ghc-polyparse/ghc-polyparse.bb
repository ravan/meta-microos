SUMMARY = "A variety of alternative parser combinator libraries"
DESCRIPTION = "A variety of alternative parser combinator libraries, including the original \
HuttonMeijer set. The Poly sets have features like good error reporting, \
arbitrary token type, running state, lazy parsing, and so on. Finally, \
Text.Parse is a proposed replacement for the standard Read class, for better \
deserialisation of Haskell values from Strings. \
 \
Old homepage: <https://archives.haskell.org/projects.haskell.org/polyparse/>."
LICENSE = "LGPL-2.1-only"

PV = "1.13.1"

RPM_NAME = "ghc-polyparse-1.13.1-1.9.aarch64.rpm"
RPM_HASH = "2e3ab35b85f99679442f5d2bef93ed0ade23f547453cbcff351cc4b857d98a4cc0c96ebe4950c515c52e4e624a0b8683f45b831bddfbb1c50eb9073449dda967"

RPROVIDES:${PN} += "ghc-polyparse \
libHSpolyparse-1.13.1-3ls9uCOTvHD6q0HF7GLFSI-ghc9.12.4.so"

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
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
