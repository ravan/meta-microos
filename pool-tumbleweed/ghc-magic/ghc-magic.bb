SUMMARY = "Interface to C file/magic library"
DESCRIPTION = "This package provides a Haskell interface to the C libmagic library. \
With it, you can determine the type of a file by examining its contents rather \
than its name. The Haskell interface provides a full-featured binding. \
 \
Note: this package requires the C libmagic library (part of the 'file' package) \
and its development headers to be installed at build time."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "ghc-magic-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "7ac97edb71739bd0c8b066855e66173a3a8437c5f4f82f38f310e202fee62a5f72330e88d57bdd3d23bc4a16b5170df584400525f06a49edda8407bedba7f07d"

RPROVIDES:${PN} += "ghc-magic \
libHSmagic-1.1.2-FUYWSwmPGvH2Sd1F0sVlnx-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmagic.so.1"

inherit rpm
