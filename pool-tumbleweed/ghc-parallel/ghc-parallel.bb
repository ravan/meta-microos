SUMMARY = "Parallel programming library"
DESCRIPTION = "This package provides a library for parallel programming. \
 \
For documentation, start from the 'Control.Parallel.Strategies' module below. \
 \
For more tutorial documentation, see the book \
<https://simonmar.github.io/pages/pcph.html Parallel and Concurrent Programming \
in Haskell>. \
 \
To understand the principles behind the library, see \
<https://simonmar.github.io/bib/papers/strategies.pdf Seq no more: Better \
Strategies for Parallel Haskell>."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-3.2.2.0-16.9.aarch64.rpm"
RPM_HASH = "b12fbedbbc55e6d625cc600c5312285b76753405031cd1a17bd9028e32972c354c0f5c23e47ee6263e6bf11c4cdeaa64b2512161e1cf6451278b0ebe0e26e27d"

RPROVIDES:${PN} += "ghc-parallel \
libHSparallel-3.2.2.0-DHmdQd1fQsJFTMvpGLTdNS-ghc9.12.4.so"

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
