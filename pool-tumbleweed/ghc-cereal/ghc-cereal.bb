SUMMARY = "A binary serialization library"
DESCRIPTION = "A binary serialization library, similar to binary, that introduces an isolate \
primitive for parser isolation, and labeled blocks for better error messages."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-0.5.8.3-2.35.aarch64.rpm"
RPM_HASH = "bc6e65dd415a7ffad4f66ab1ea5afae8d14ef17c5d5373fe674342a747622a91dc625bc04d5c74aefac3ff5b4fb16c933a72e984f3f092a27300074c692092ae"

RPROVIDES:${PN} += "ghc-cereal \
libHScereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
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
