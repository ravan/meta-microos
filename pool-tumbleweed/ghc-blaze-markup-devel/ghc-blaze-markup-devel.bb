SUMMARY = "Haskell blaze-markup library development files"
DESCRIPTION = "This package provides the Haskell blaze-markup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.3.0"

RPM_NAME = "ghc-blaze-markup-devel-0.8.3.0-3.21.aarch64.rpm"
RPM_HASH = "3ac7a15c66c70d43cffe47c457d7cd1080c8d2b7c1c7737d9573eeea41ad939434044f60efc62cd7561c1f019dd3c9feb6044733d28aeb03769aa6daea66c493"

RPROVIDES:${PN} += "ghc-blaze-markup-devel \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-markup \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-text-2.1.4-cf23"

inherit rpm
