SUMMARY = "Haskell hslua-module-text profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-text profiling library."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "ghc-hslua-module-text-prof-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "2a7c7d02eeabdefd97c0c5c0fd26540eaed6645ba4c51dbddad2751206e9eb09bfde78a2a2d516cd419a0132660b700ee15adfe48321f373c9794beec1bc2923"

RPROVIDES:${PN} += "ghc-hslua-module-text-prof \
ghc-prof-hslua-module-text-1.2.0-DwjhamFyoyqDccdYnCveaY"

RDEPENDS:${PN} += "ghc-hslua-module-text-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-prof-text-2.1.4-cf23"

inherit rpm
