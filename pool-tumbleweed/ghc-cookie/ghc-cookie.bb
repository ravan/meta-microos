SUMMARY = "HTTP cookie parsing and rendering"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <https://www.stackage.org/package/cookie>."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "ghc-cookie-0.5.1-1.12.aarch64.rpm"
RPM_HASH = "cb2f07e165929769ab16ee3117f358cfc05cb0f5ab34ddf3e06fa9af796ca9390b1c0ecd7784d7b0bdcb64330dda0a81c7c9ae289f9729e907400f78caf286ed"

RPROVIDES:${PN} += "ghc-cookie \
libHScookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdata-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ-ghc9.12.4.so \
libHSdata-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
