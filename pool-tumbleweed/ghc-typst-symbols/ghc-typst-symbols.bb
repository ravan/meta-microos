SUMMARY = "Symbol and emoji lookup for typst language"
DESCRIPTION = "This package defines symbol and emoji codes for the typst language \
(<https://typst.app>)."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "ghc-typst-symbols-0.2-1.2.aarch64.rpm"
RPM_HASH = "40bb3208ce4e8a9af09e0499f165cf6f139efb3f6ba14ff0aff8f5e3e5dc3b6bf372f9b5d315a2d304789e51893731d4181dc11527690d1d0b70e437555ed7f5"

RPROVIDES:${PN} += "ghc-typst-symbols \
libHStypst-symbols-0.2-DAnODvBkUY47mTgQn4NVCA-ghc9.12.4.so"

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
