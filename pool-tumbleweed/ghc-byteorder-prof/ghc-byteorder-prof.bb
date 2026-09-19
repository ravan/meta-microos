SUMMARY = "Haskell byteorder profiling library"
DESCRIPTION = "This package provides the Haskell byteorder profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-prof-1.0.4-4.19.aarch64.rpm"
RPM_HASH = "40ac09a835eca59c0cf9e1c45fe8f4a80cabe9c77b785293e5e78816295c4e34a6a646ebf1cb4f836237b303c0303233220b992988968f3cfda29f49ab858fdc"

RPROVIDES:${PN} += "ghc-byteorder-prof \
ghc-prof-byteorder-1.0.4-2KwV8jNH81I9JBUzKyr4X2"

RDEPENDS:${PN} += "ghc-byteorder-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
