SUMMARY = "Haskell cborg library development files"
DESCRIPTION = "This package provides the Haskell cborg library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.10.0"

RPM_NAME = "ghc-cborg-devel-0.2.10.0-4.11.aarch64.rpm"
RPM_HASH = "b0e8ca771695f678e226763f22950398cd7f9908f7fab00ff9228153180b323e6df0c4ff2fe3b8541c49cc419554b5f3d1e17bda72ff9e7215568a00a0ca56d3"

RPROVIDES:${PN} += "ghc-cborg-devel \
ghc-devel-cborg-0.2.10.0-64S0XwCJRqFCXzW08346EZ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cborg \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-bignum-1.3-03b0 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-half-0.3.3-7uW8H7RguCn8iNkagLajaD \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-text-2.1.4-cf23"

inherit rpm
