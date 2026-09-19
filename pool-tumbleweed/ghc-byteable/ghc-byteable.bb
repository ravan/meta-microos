SUMMARY = "Type class for sequence of bytes"
DESCRIPTION = "Abstract class to manipulate sequence of bytes \
 \
The use case of this class is abstracting manipulation of types that are just \
wrapping a bytestring with stronger and more meaniful name. \
 \
Usual definition of those types are of the form: newtype MyType = MyType \
ByteString."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-0.1.1-12.19.aarch64.rpm"
RPM_HASH = "03b45584635cef5451d05292c1bd3f2ee5dded839293a7b159e1e76e639f6f8b85762136c797e60fc3b7c54f1a7aef35f707cf729b953878e77f51d8c5b2c551"

RPROVIDES:${PN} += "ghc-byteable \
libHSbyteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo-ghc9.12.4.so"

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
