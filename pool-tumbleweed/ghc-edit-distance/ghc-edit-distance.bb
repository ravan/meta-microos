SUMMARY = "Levenshtein and restricted Damerau-Levenshtein edit distances"
DESCRIPTION = "Optimized edit distances for fuzzy matching, including Levenshtein and \
restricted Damerau-Levenshtein algorithms."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-0.2.2.1-13.42.aarch64.rpm"
RPM_HASH = "efa565b1d2097f7e71346142a777c2f6d80c88b152f3e6aab65aef9b1a049282a22e06a756a62aa3488ce26c0446dd00c650025386bb6df4fa053a1839b58b8b"

RPROVIDES:${PN} += "ghc-edit-distance \
libHSedit-distance-0.2.2.1-JLsBE1yu1uvGNk4hnNxFMI-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
