SUMMARY = "Haskell cborg profiling library"
DESCRIPTION = "This package provides the Haskell cborg profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.10.0"

RPM_NAME = "ghc-cborg-prof-0.2.10.0-4.11.aarch64.rpm"
RPM_HASH = "b6e21be91a176c10677ad5b456f9010a0b2669363c5e1526ef7a144fbfbb17e085bdf7b8a5e2ddb7d922705a4fc1d96cf6e800f6929243614e6801862f36ce3c"

RPROVIDES:${PN} += "ghc-cborg-prof \
ghc-prof-cborg-0.2.10.0-64S0XwCJRqFCXzW08346EZ"

RDEPENDS:${PN} += "ghc-cborg-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-bignum-1.3-03b0 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-half-0.3.3-7uW8H7RguCn8iNkagLajaD \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-text-2.1.4-cf23"

inherit rpm
