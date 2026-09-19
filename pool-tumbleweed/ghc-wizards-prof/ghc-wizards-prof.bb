SUMMARY = "Haskell wizards profiling library"
DESCRIPTION = "This package provides the Haskell wizards profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-prof-1.0.3-7.16.aarch64.rpm"
RPM_HASH = "794b7ea70dcf51d014b0ce5c269fedad3a60366186b75f28dd7d10a1797a0611d7953e8dd05a7621520ae1626b2bf4a7ee96a5c3872c5751b2023543b65ada52"

RPROVIDES:${PN} += "ghc-prof-wizards-1.0.3-4fQKmsLBMwT4qK3PkBwApR \
ghc-wizards-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-control-monad-free-0.6.2-INrHbxo4qSqC5LftAQgJHR \
ghc-prof-haskeline-0.8.4.1-767e \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-wizards-devel"

inherit rpm
