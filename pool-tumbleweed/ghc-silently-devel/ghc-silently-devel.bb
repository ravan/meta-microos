SUMMARY = "Haskell silently library development files"
DESCRIPTION = "This package provides the Haskell silently library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.4"

RPM_NAME = "ghc-silently-devel-1.2.5.4-1.15.aarch64.rpm"
RPM_HASH = "b09e4b8387679c304ad3afeccedbe5037465d265f18f000a11b059bc5ab05cd3fa4b24273c57e4323d7d02686bd425d385ff0d48e28e81594476bb8b44297ed9"

RPROVIDES:${PN} += "ghc-devel-silently-1.2.5.4-54yCGOZ1hqDAcZZPz9a2Bu \
ghc-silently-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-silently"

inherit rpm
