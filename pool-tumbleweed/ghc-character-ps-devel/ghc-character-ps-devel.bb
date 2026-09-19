SUMMARY = "Haskell character-ps library development files"
DESCRIPTION = "This package provides the Haskell character-ps library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-character-ps-devel-0.1-1.17.aarch64.rpm"
RPM_HASH = "9017a25d8c408a8bcadcc71ca8934a8c8d5f13a5b6cd400f2b2c1040533d28756461196e02e6276b8bd4ba9383f384b7bda645b4d81cb8145747a4bd6f320779"

RPROVIDES:${PN} += "ghc-character-ps-devel \
ghc-devel-character-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-character-ps \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
