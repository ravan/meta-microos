SUMMARY = "Haskell lifted-base profiling library"
DESCRIPTION = "This package provides the Haskell lifted-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-prof-0.2.3.12-8.36.aarch64.rpm"
RPM_HASH = "a13a385bce01fd362c7688474dd29e44676ec0c3e1b14409bb6d12f068ae5848494ee39a7c2ac1f6d19d1e02912b9917e4b17fcef81efdc1e165f208f22d8d4b"

RPROVIDES:${PN} += "ghc-lifted-base-prof \
ghc-prof-lifted-base-0.2.3.12-BonMj4p70Ef8zpL3zVJvsV"

RDEPENDS:${PN} += "ghc-lifted-base-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB"

inherit rpm
