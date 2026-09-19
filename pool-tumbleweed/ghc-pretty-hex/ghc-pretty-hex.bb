SUMMARY = "A library for hex dumps of ByteStrings"
DESCRIPTION = "This library generates pretty hex dumps of ByteStrings in the style of other \
common *nix hex dump tools."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-1.1-4.19.aarch64.rpm"
RPM_HASH = "ae5612bf6fa57783aa0b3c53c8b21bb355403454c22fadbbc5edac7f2d555cc848bda2e0d09a010a78cdb8cec673fc81cb878f6f600ef5c3a163097a4774a670"

RPROVIDES:${PN} += "ghc-pretty-hex \
libHSpretty-hex-1.1-9KkuISSwhPFByR4xDG3StA-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
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
