SUMMARY = "Haskell crypton-x509-validation profiling library"
DESCRIPTION = "This package provides the Haskell crypton-x509-validation profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "ghc-crypton-x509-validation-prof-1.9.1-1.2.aarch64.rpm"
RPM_HASH = "273239678b084a65d43832cb3fc87c3f022f51041dd176fc0aeb2ea9a6a6edad1b60b1384be971b3e4a18ae6a783884569508e06682c364284f0cce37c88f922"

RPROVIDES:${PN} += "ghc-crypton-x509-validation-prof \
ghc-prof-crypton-x509-validation-1.9.1-A5KE59wkqBYCYMNBGaEl3l"

RDEPENDS:${PN} += "ghc-crypton-x509-validation-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1 \
ghc-prof-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-prof-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij \
ghc-prof-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-prof-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-prof-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l"

inherit rpm
