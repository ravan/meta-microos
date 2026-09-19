SUMMARY = "Haskell hslua-packaging library development files"
DESCRIPTION = "This package provides the Haskell hslua-packaging library development \
files."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "ghc-hslua-packaging-devel-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "064bb80f6dfc0676bfca376f83c980518fd98c0b1e5f0641727b8f0b2890408e6e54a4a5ff5bee002c330ef80fdcdab55d3fbb98d07b72f56da6a962a72c5af6"

RPROVIDES:${PN} += "ghc-devel-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-hslua-packaging-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF \
ghc-devel-hslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-packaging"

inherit rpm
