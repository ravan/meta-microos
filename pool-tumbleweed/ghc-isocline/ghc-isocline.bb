SUMMARY = "A portable alternative to GNU Readline"
DESCRIPTION = "![logo](https://raw.githubusercontent.com/daanx/isocline/main/doc/isocline-inline.svg) \
A Haskell wrapper around the [Isocline C \
library](https://github.com/daanx/isocline#readme) which can provide an \
alternative to GNU Readline. (The Isocline library is included whole and there \
are no runtime dependencies). Please see the \
[readme](https://github.com/daanx/isocline/haskell#readme) on GitHub for more \
information."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-1.0.9-3.12.aarch64.rpm"
RPM_HASH = "d932a8c7b1eb50fcb46a861bbaf46889a8ae1d027ed181feb4683c983a6a6f70c864e16e805babfb85c4cf53b928fcd7c9101359ba535c2a420a1372347d4b5c"

RPROVIDES:${PN} += "ghc-isocline \
libHSisocline-1.0.9-1LtJKbO57TxJAL2UMR5S4N-ghc9.12.4.so"

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
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
