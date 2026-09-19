SUMMARY = "Haskell hslua-objectorientation profiling library"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation profiling library."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-hslua-objectorientation-prof-2.5.0-1.3.aarch64.rpm"
RPM_HASH = "419dd5ca938a03b7769a9c3b60eae8a6447f6f6e5c4abaf94279945a672b779dfcaefdcaa2ad6023109250bcba1bebf836687d36d7123685d6cb7e67c6088f64"

RPROVIDES:${PN} += "ghc-hslua-objectorientation-prof \
ghc-prof-hslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF"

RDEPENDS:${PN} += "ghc-hslua-objectorientation-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT \
ghc-prof-text-2.1.4-cf23"

inherit rpm
