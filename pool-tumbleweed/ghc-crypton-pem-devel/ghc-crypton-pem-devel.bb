SUMMARY = "Haskell crypton-pem library development files"
DESCRIPTION = "This package provides the Haskell crypton-pem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-crypton-pem-devel-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "1f2cce3dfa9dae24d0bc20b4163e18d85d6eb0d4c21f3530c89a139536c88406e8b0f79f240b613de625fa3fc29f7341dfb88bad828fe6e27f1b8f30860dd3af"

RPROVIDES:${PN} += "ghc-crypton-pem-devel \
ghc-devel-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-pem \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-1.0-Ca310PwaD9pGmjzA3S4jr6 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-text-2.1.4-cf23"

inherit rpm
