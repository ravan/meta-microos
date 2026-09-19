SUMMARY = "Locale library"
DESCRIPTION = "This package provides the ability to adapt to locale conventions such as date \
and time formats."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-1.0.0.7-13.23.aarch64.rpm"
RPM_HASH = "7278eaa9c14563674f78402836ba932eaa01661676424bb1b3a24e9fe1b1538ec22eec75fd86e2567bbf2bee4f3399a1af6f9cbca14a7e526b0f72f3ec264682"

RPROVIDES:${PN} += "ghc-old-locale \
libHSold-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
