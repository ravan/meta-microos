SUMMARY = "Haskell csv library development files"
DESCRIPTION = "This package provides the Haskell csv library development files."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-devel-0.1.2-4.19.aarch64.rpm"
RPM_HASH = "a7fc30759aae9356203a2a462cd2371d61503fc592370bde0e09cbec2dacf631e795001d945f7c1686ee526b4b040ba49fe2e748de29f17126c8592f45ed9338"

RPROVIDES:${PN} += "ghc-csv-devel \
ghc-devel-csv-0.1.2-3wV9bBF7sWG7h8WLMiwYq8"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-csv \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-parsec-3.1.18.0-be05"

inherit rpm
