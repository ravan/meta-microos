SUMMARY = "Haskell ghc-boot-th library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library development files."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-boot-th-devel-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "5259276976fd7f5c03f2f00781885082292cf7883b48ce1a909b39858dd8a95e0c79734da6492f4a4444281cdf0107fda555b00055b58e03b6a4942682ca224d"

RPROVIDES:${PN} += "ghc-devel-ghc-boot-th-9.12.4-0605 \
ghc-ghc-boot-th-devel \
ghc-ghc-boot-th-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-internal-9.1204.0-f1e1 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-ghc-boot-th"

inherit rpm
