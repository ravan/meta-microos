SUMMARY = "Haskell 98 phantom types to avoid unsafely passing dummy arguments"
DESCRIPTION = "Haskell 98 phantom types to avoid unsafely passing dummy arguments."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-tagged-0.8.10-2.3.aarch64.rpm"
RPM_HASH = "2691584171bb1b022cb465a9f879128fda2a98cb026111c524de7b06d92d77e616ac878b6e140a67ad1b2ee621a38b12728d41be93191e4bc994147b52aa5ab7"

RPROVIDES:${PN} += "ghc-tagged \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
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
