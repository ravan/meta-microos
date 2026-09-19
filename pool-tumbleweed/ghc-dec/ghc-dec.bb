SUMMARY = "Decidable propositions"
DESCRIPTION = "This package provides a 'Dec' type. \
 \
' type Neg a = a -> Void \
 \
data Dec a = Yes a | No (Neg a) '."
LICENSE = "BSD-3-Clause"

PV = "0.0.6"

RPM_NAME = "ghc-dec-0.0.6-3.2.aarch64.rpm"
RPM_HASH = "514f3b370d5f4ea521f727044cb23245a355afdf5ab26baba5cf7d88f67c220a888696b4503bcc9f67671fb5c28f1103fb8d9177a520b49f8fa6ce2551316e51"

RPROVIDES:${PN} += "ghc-dec \
libHSdec-0.0.6-9n55jO9wFkCDcYlO4DYA9w-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSboring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
