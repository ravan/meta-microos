SUMMARY = "Haskell bindings to setlocale"
DESCRIPTION = "Haskell bindings to setlocale."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-1.0.0.10-8.5.aarch64.rpm"
RPM_HASH = "59c0871e703e47cf76383c7342eb08ce5cc427d428ebcb1dc73c2ee9ff5aaf42608a33e7097656e2000c193c8532685358aef299c1c82a7ee0027a4abf23feb5"

RPROVIDES:${PN} += "ghc-setlocale \
libHSsetlocale-1.0.0.10-1AxYf6FKOpjAmPtKjx6N4K-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
