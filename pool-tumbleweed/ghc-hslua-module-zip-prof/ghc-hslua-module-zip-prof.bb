SUMMARY = "Haskell hslua-module-zip profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-zip profiling library."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ghc-hslua-module-zip-prof-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "412d8857156c962c1ffbc7f56644e64ffe27f83be78b69abfcf2cd75f0cc7291217bbca7f67e5db148da14f9cc6a42392691f6b206c132ead145621468e99f7c"

RPROVIDES:${PN} += "ghc-hslua-module-zip-prof \
ghc-prof-hslua-module-zip-1.2.1-FF7qqe9nCmKFvC25WW3iJH"

RDEPENDS:${PN} += "ghc-hslua-module-zip-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-list-1.1.4-2iYtswPM1Oh6QVQjUY3AZP \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-zip-archive-0.4.3.2-7LOPKgQ3Ei9AA5FjkJE7vc"

inherit rpm
