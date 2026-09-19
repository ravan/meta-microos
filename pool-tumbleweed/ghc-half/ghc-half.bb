SUMMARY = "Half-precision floating-point"
DESCRIPTION = "Half-precision floating-point."
LICENSE = "BSD-2-Clause"

PV = "0.3.3"

RPM_NAME = "ghc-half-0.3.3-3.3.aarch64.rpm"
RPM_HASH = "a6d11bf64838eaac64a625cac1c29ba7a65f42ba000dcb03e789015bc60eb400c31c49808a6374e7db46c64e8497d05fb27caa1d22074a815c6bd78c318afa96"

RPROVIDES:${PN} += "ghc-half \
libHShalf-0.3.3-7uW8H7RguCn8iNkagLajaD-ghc9.12.4.so"

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
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
