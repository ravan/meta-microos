SUMMARY = "Haskell hslua-module-version profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-version profiling library."
LICENSE = "MIT"

PV = "1.2.0.1"

RPM_NAME = "ghc-hslua-module-version-prof-1.2.0.1-1.2.aarch64.rpm"
RPM_HASH = "75084e3f27bb389e0cd265c405e34e94f1afe9905bb3e7aca2456e59d85dd109d065cb1764b8baeeb5317252e58ccb44f46e8b442cad3afe7e84c6fd7849f215"

RPROVIDES:${PN} += "ghc-hslua-module-version-prof \
ghc-prof-hslua-module-version-1.2.0.1-7Ta1Mn5URCJ9Pe3cHjwQh"

RDEPENDS:${PN} += "ghc-hslua-module-version-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA \
ghc-prof-text-2.1.4-cf23"

inherit rpm
