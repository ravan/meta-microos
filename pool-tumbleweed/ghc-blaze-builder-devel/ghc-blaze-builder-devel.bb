SUMMARY = "Haskell blaze-builder library development files"
DESCRIPTION = "This package provides the Haskell blaze-builder library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.1"

RPM_NAME = "ghc-blaze-builder-devel-0.4.4.1-1.9.aarch64.rpm"
RPM_HASH = "b943b26cc1e85b09553752ff346416d2a5290312c4baa69aa5c0cd40e0ed07ea99e46d50ff45378719eb86b0f4b4a1c216ed9446c0dc8bfa16cedc295abcb459"

RPROVIDES:${PN} += "ghc-blaze-builder-devel \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-builder \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-text-2.1.4-cf23"

inherit rpm
