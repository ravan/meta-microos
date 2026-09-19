SUMMARY = "Diff algorithm in pure Haskell"
DESCRIPTION = "Implementation of the standard diff algorithm in Haskell. \
 \
Time complexity is O(ND) (input length * number of differences). Space \
complexity is O(D^2). Includes utilities for pretty printing."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-Diff-1.0.2-1.12.aarch64.rpm"
RPM_HASH = "830d0bd0595d5e21f04f871306f5d09c03f39ba2a820634bb0f8968d961510ec19c65561aaf5d68da94b9aa0ac02fdd4981aa5d92631ef16bd8d2e27aafdc448"

RPROVIDES:${PN} += "ghc-Diff \
libHSDiff-1.0.2-5PTxq8P0tjM13opDjMQ0ap-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
