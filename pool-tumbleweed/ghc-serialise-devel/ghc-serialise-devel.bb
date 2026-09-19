SUMMARY = "Haskell serialise library development files"
DESCRIPTION = "This package provides the Haskell serialise library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.1"

RPM_NAME = "ghc-serialise-devel-0.2.6.1-5.15.aarch64.rpm"
RPM_HASH = "c288741d586c9ac8f267c6ee42594a44e15eac48cd916b9419f457863a9f9fb70cb617b3195ed563d7dcb2cb25f0e14a1faa6123278dfe41b7804b61f68b57ae"

RPROVIDES:${PN} += "ghc-devel-serialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7 \
ghc-serialise-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cborg-0.2.10.0-64S0XwCJRqFCXzW08346EZ \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-half-0.3.3-7uW8H7RguCn8iNkagLajaD \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-strict-0.5.1-9s5NAvHzvkrI18NRIQgFhz \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-devel-time-1.14-a7dc \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-serialise"

inherit rpm
