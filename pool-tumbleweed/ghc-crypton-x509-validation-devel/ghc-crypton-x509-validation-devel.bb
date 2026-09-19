SUMMARY = "Haskell crypton-x509-validation library development files"
DESCRIPTION = "This package provides the Haskell crypton-x509-validation library \
development files."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "ghc-crypton-x509-validation-devel-1.9.1-1.2.aarch64.rpm"
RPM_HASH = "f915a488cf335debd519573e0c226a6ddf40cf35962a3a16a51e596197c84fcc88c00cd725589adfb7fa8c4e7ea5a7c7b306631cef02e1eaa7e202c5bf1ae053"

RPROVIDES:${PN} += "ghc-crypton-x509-validation-devel \
ghc-devel-crypton-x509-validation-1.9.1-A5KE59wkqBYCYMNBGaEl3l"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-x509-validation \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1 \
ghc-devel-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-devel-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij \
ghc-devel-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-devel-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-devel-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l"

inherit rpm
