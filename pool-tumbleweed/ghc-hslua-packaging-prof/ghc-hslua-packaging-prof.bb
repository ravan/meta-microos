SUMMARY = "Haskell hslua-packaging profiling library"
DESCRIPTION = "This package provides the Haskell hslua-packaging profiling library."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "ghc-hslua-packaging-prof-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "79284f52e7968d655fd34c5d3597cce4abaee7b2288f99cf34e16ba0878c3804d1c806b56d1e00bafaecf56a0a09d652e8cc7f5e1a10f2154087000f27b294fc"

RPROVIDES:${PN} += "ghc-hslua-packaging-prof \
ghc-prof-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA"

RDEPENDS:${PN} += "ghc-hslua-packaging-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF \
ghc-prof-hslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT \
ghc-prof-text-2.1.4-cf23"

inherit rpm
