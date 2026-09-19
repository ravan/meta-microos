SUMMARY = "Haskell ghc-boot-th profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-boot-th-prof-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "2431d49c662b80fe098ac5f72bba6d11f4d986a3c808bb07a4e1cac7e5055c5ba208d9fc5dc7d7ec4792b7447e530a01249a04a57174e6a9aaf0afc0f9e8e7d3"

RPROVIDES:${PN} += "ghc-ghc-boot-th-prof \
ghc-prof-ghc-boot-th-9.12.4-0605 \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-ghc-boot-th-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-internal-9.1204.0-f1e1 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-pretty-1.1.3.6-b7fd \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
