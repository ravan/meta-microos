SUMMARY = "Haskell hslua-module-path profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-path profiling library."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ghc-hslua-module-path-prof-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "10bd7c74fe1fb4bafd86a4772d8203aaced4a0068d047e31c037f40114329dca6cc70bda768178986b2b237d76d4b55a341b745d2e195892df608b9eaea1f263"

RPROVIDES:${PN} += "ghc-hslua-module-path-prof \
ghc-prof-hslua-module-path-1.2.0-G27JYvFqudKJwS1Lw18QeC"

RDEPENDS:${PN} += "ghc-hslua-module-path-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-prof-text-2.1.4-cf23"

inherit rpm
