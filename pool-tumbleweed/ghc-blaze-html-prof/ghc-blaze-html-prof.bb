SUMMARY = "Haskell blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.2.0"

RPM_NAME = "ghc-blaze-html-prof-0.9.2.0-2.17.aarch64.rpm"
RPM_HASH = "6edbf8f30c10977dd6e65a8c802de58eabdf91232410ede0653f43c76cb44e528f568e04c9957bdcee3d22dad1d0883bccb7797c6972a8904cc5f54a82855844"

RPROVIDES:${PN} += "ghc-blaze-html-prof \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o"

RDEPENDS:${PN} += "ghc-blaze-html-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-text-2.1.4-cf23"

inherit rpm
