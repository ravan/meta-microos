SUMMARY = "Haskell hscolour library"
DESCRIPTION = "This package provides the Haskell hscolour shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25"

RPM_NAME = "ghc-hscolour-1.25-1.32.aarch64.rpm"
RPM_HASH = "d3a2a0b1a2a1542903f2b3091c8ac770aca6884ee0835c24c1926349ec43162d7ead59cce32462fffb76caf1a0fdc8bb58db9bf48229575492413b5f12d01b6b"

RPROVIDES:${PN} += "ghc-hscolour \
libHShscolour-1.25-7g5wxbCbTVu2XnpAXvjFVU-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
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
