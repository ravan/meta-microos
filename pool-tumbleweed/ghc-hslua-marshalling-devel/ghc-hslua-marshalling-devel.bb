SUMMARY = "Haskell hslua-marshalling library development files"
DESCRIPTION = "This package provides the Haskell hslua-marshalling library development \
files."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-marshalling-devel-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "69ce347f6386d32e97b2320791f0fd4982c0206011c7ae0d811d05678f6883887ff47b8d4cc6e478cade17959b17169072c95ffcad30b29aba008cf409f8f2fd"

RPROVIDES:${PN} += "ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-hslua-marshalling-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-text-2.1.4-cf23 \
ghc-hslua-marshalling"

inherit rpm
