SUMMARY = "Haskell base-orphans library development files"
DESCRIPTION = "This package provides the Haskell base-orphans library development files."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "ghc-base-orphans-devel-0.9.4-1.3.aarch64.rpm"
RPM_HASH = "01fe207c169f59748e6a64d74f325976d8f9a892c6a44a89cbc28c9fa1474358722c5b3c849040b38a90a3f00447f8f536d83b2bc1cc6269038b84d58fe38204"

RPROVIDES:${PN} += "ghc-base-orphans-devel \
ghc-devel-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-orphans \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
