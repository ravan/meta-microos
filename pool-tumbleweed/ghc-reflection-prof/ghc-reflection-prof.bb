SUMMARY = "Haskell reflection profiling library"
DESCRIPTION = "This package provides the Haskell reflection profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "ghc-reflection-prof-2.1.9-2.12.aarch64.rpm"
RPM_HASH = "6ae33d5586ad936f367dcea7d025f29cbe02bcb2d1f06583cada33924d9f67d8f067531544dc3b0790130d399a5819b11b68984d9ca74ff67ce42d12fe7f9a97"

RPROVIDES:${PN} += "ghc-prof-reflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF \
ghc-reflection-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-reflection-devel"

inherit rpm
