SUMMARY = "Haskell array library"
DESCRIPTION = "This package provides the Haskell array library."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.0"

RPM_NAME = "ghc-array-0.5.8.0-1.3.aarch64.rpm"
RPM_HASH = "7a20d58633488d53c6b6e657cf2b23d5a0706e562621072664d49d3af02ac198aee6397e1a5b0c0f105088c0c8052e75d4a44f5a52228505eb29c40c8ccec22a"

RPROVIDES:${PN} += "ghc-array \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
