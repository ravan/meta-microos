SUMMARY = "Haskell haskell-src-meta profiling library"
DESCRIPTION = "This package provides the Haskell haskell-src-meta profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.15"

RPM_NAME = "ghc-haskell-src-meta-prof-0.8.15-2.3.aarch64.rpm"
RPM_HASH = "2a842d48e8a9493802f63ddaf2f3a71b0672a08721daa1ff1b4da5a1d2e1cd0b18ca2aa9c2c84caf823a74bc1bb70b095971d50d9d7b1b6b6d4f58e311edcd05"

RPROVIDES:${PN} += "ghc-haskell-src-meta-prof \
ghc-prof-haskell-src-meta-0.8.15-FnQqpPy0mwl8lKE5H2GQu6"

RDEPENDS:${PN} += "ghc-haskell-src-meta-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-haskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-orphans-0.13.17-JrR2fnTKxP4E1CBKEHbpQ2"

inherit rpm
