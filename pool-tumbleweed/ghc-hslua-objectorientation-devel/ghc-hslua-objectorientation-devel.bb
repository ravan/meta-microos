SUMMARY = "Haskell hslua-objectorientation library development files"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation library \
development files."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-hslua-objectorientation-devel-2.5.0-1.3.aarch64.rpm"
RPM_HASH = "fc8ea1abd906b4f783fe8502ebc0159ffa3b31ab75925d52c5dc30ff3ab5ebf57ff73b34bd2a47f7d604c1c99a90a6c8f937b5f792edf7fe7d8e445be0e75602"

RPROVIDES:${PN} += "ghc-devel-hslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF \
ghc-hslua-objectorientation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-objectorientation"

inherit rpm
