SUMMARY = "Haskell hslua-typing library development files"
DESCRIPTION = "This package provides the Haskell hslua-typing library development files."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "ghc-hslua-typing-devel-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "94a21ccddb256b01cfd77412cda6de998e03427b4b8cc1e1a620536abec768e2f13d01cc2a4037f42b8b0d8c9d37df3f69685b365f9d8b7161dc0b978db5e931"

RPROVIDES:${PN} += "ghc-devel-hslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT \
ghc-hslua-typing-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-hslua-typing"

inherit rpm
