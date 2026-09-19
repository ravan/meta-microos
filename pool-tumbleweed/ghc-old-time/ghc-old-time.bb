SUMMARY = "Time library"
DESCRIPTION = "This is a legacy package, please migrate away to \
<http://hackage.haskell.org/package/time time> or elsewhere."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-old-time-1.1.1.0-1.3.aarch64.rpm"
RPM_HASH = "9db676a5692e36c0df54729881b27f0048a5e3b5b712f6bb0d07c07db4f6c8d60feeb1baba9f4e6581248a3ecd42bb8a5845845b890086e059da54a2136fca7d"

RPROVIDES:${PN} += "ghc-old-time \
libHSold-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSold-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
