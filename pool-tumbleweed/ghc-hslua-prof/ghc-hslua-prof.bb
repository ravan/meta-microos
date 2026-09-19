SUMMARY = "Haskell hslua profiling library"
DESCRIPTION = "This package provides the Haskell hslua profiling library."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-hslua-prof-2.5.0-1.2.aarch64.rpm"
RPM_HASH = "e14d2eedbfea02c67de0414103b90199f63ab05a50e874f6c183bd7a9162634a9241751b84669fe11f75a3b0f90d5f93a108bc1b3f317d47dc2a67b8be0e2ab0"

RPROVIDES:${PN} += "ghc-hslua-prof \
ghc-prof-hslua-2.5.0-EJ5RjGxg4AI6GL8E9HKZKp"

RDEPENDS:${PN} += "ghc-hslua-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-hslua-aeson-2.3.2-2NAF9YW3ljB9EkcWLhnec \
ghc-prof-hslua-classes-2.3.2-C895qHuusP79caxJu1uhwF \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF \
ghc-prof-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-prof-hslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT"

inherit rpm
