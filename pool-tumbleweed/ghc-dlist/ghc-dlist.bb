SUMMARY = "Difference lists"
DESCRIPTION = "List-like types supporting O(1) append and snoc operations."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-1.0-5.16.aarch64.rpm"
RPM_HASH = "6957770baa411df9fda9ebfbbfab0428cef95b2fef498b342a237c2677c9a1a2d61d3b673c02eadf6ad5494ad61625cfd2ff2986d10b54d864a82c9573ffaf04"

RPROVIDES:${PN} += "ghc-dlist \
libHSdlist-1.0-24EafZnoZk8EE7HqnP59eC-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
