SUMMARY = "Haskell hashtables library development files"
DESCRIPTION = "This package provides the Haskell hashtables library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "ghc-hashtables-devel-1.4.2-1.20.aarch64.rpm"
RPM_HASH = "864a4feb0da96aa5d51a6efd1fb2f1128a07c1a23448684c397f6f845c7442e373bc6270a80056c056b10bc6c1cb6b1402be3c3acf158a512f4012cc7091f866"

RPROVIDES:${PN} += "ghc-devel-hashtables-1.4.2-FXtFcQfURO18P8ZBa2ZYOT \
ghc-hashtables-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-hashtables"

inherit rpm
