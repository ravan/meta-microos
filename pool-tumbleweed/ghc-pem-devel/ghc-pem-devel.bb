SUMMARY = "Haskell pem library development files"
DESCRIPTION = "This package provides the Haskell pem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-devel-0.2.4-8.31.aarch64.rpm"
RPM_HASH = "1bbf3eec24f2073239cb76517ca90e0e14fe1f5fbc73dbaae3750a2d98582521b0d42219f8b0801a5b81c33c42c85e2962badf1110bff6682c8930442ff49d95"

RPROVIDES:${PN} += "ghc-devel-pem-0.2.4-HqB1KmdaogjHqJ1PBuavhl \
ghc-pem-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-pem"

inherit rpm
