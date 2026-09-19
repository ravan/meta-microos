SUMMARY = "Haskell hslua-classes library development files"
DESCRIPTION = "This package provides the Haskell hslua-classes library development files."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-classes-devel-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "ce30ee159e00aebee24430e3ab8e052c0d419e424a8d254d4059d978a82cd842c232e241eb468816e8ff61f4538bbc1c0d1ebed29f20c1c12026877013cfda72"

RPROVIDES:${PN} += "ghc-devel-hslua-classes-2.3.2-C895qHuusP79caxJu1uhwF \
ghc-hslua-classes-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-classes"

inherit rpm
