SUMMARY = "Haskell hslua-module-path library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-path library development \
files."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ghc-hslua-module-path-devel-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "a08710308a6e45162401acf045b9c236a4cecfd35db29abc1bda0dd5436ca1caa0ebefad2fe77d7e39b80a183f30a9943063cf1e63ace45e80029ae51719ed32"

RPROVIDES:${PN} += "ghc-devel-hslua-module-path-1.2.0-G27JYvFqudKJwS1Lw18QeC \
ghc-hslua-module-path-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-module-path"

inherit rpm
