SUMMARY = "HTML combinator library"
DESCRIPTION = "This package contains a combinator library for constructing HTML documents."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-1.0.1.2-4.19.aarch64.rpm"
RPM_HASH = "af375e3024e919f5620bf1299e9bbf40b29b3dbd4cd5e622441e89e8035f86f329cd83ef06e4d75f7d3f4fe9a99af077f43d37158ef9d5470439e15c8430b85c"

RPROVIDES:${PN} += "ghc-html \
libHShtml-1.0.1.2-47pIZc0gzI25DOiguxUrYX-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
