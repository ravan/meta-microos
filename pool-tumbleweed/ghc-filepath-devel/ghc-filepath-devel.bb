SUMMARY = "Haskell filepath library development files"
DESCRIPTION = "This package provides the Haskell filepath library development files."
LICENSE = "BSD-3-Clause"

PV = "1.5.5.0"

RPM_NAME = "ghc-filepath-devel-1.5.5.0-1.3.aarch64.rpm"
RPM_HASH = "fd3bb205ed060d8ab7a5459b7823bcc8c78d67b7ebd0d76429b23fc89cdb5225f62e474c8d6441fde2448850df0144b8b380cd02b429eb8088533cfbbc5d909d"

RPROVIDES:${PN} += "ghc-devel-filepath-1.5.5.0-b25b \
ghc-filepath-devel \
ghc-filepath-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-filepath"

inherit rpm
