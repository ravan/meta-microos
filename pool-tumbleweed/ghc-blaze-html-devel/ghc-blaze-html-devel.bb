SUMMARY = "Haskell blaze-html library development files"
DESCRIPTION = "This package provides the Haskell blaze-html library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.2.0"

RPM_NAME = "ghc-blaze-html-devel-0.9.2.0-2.17.aarch64.rpm"
RPM_HASH = "327cbbd50ef455d99f1108c18e733f046d7c19c4e7d2d77c1884987d6116a2d99f3daf7b08a60726fca4e6049990c9412e56e70be6a0705ad7c709cfbffa7bd5"

RPROVIDES:${PN} += "ghc-blaze-html-devel \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-html \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-text-2.1.4-cf23"

inherit rpm
