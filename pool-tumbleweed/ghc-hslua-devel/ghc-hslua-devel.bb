SUMMARY = "Haskell hslua library development files"
DESCRIPTION = "This package provides the Haskell hslua library development files."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-hslua-devel-2.5.0-1.2.aarch64.rpm"
RPM_HASH = "9169620b1bed7a157b8f738470375f3d84fa94f0a3cf7133e52b2896672ceef0a5113890f32ec646cfddc72852b9872ce96744ae6b93727fff9f7caf77b59f55"

RPROVIDES:${PN} += "ghc-devel-hslua-2.5.0-EJ5RjGxg4AI6GL8E9HKZKp \
ghc-hslua-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-hslua-aeson-2.3.2-2NAF9YW3ljB9EkcWLhnec \
ghc-devel-hslua-classes-2.3.2-C895qHuusP79caxJu1uhwF \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF \
ghc-devel-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-devel-hslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT \
ghc-hslua"

inherit rpm
