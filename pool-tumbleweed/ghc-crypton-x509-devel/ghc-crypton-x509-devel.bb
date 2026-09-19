SUMMARY = "Haskell crypton-x509 library development files"
DESCRIPTION = "This package provides the Haskell crypton-x509 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "ghc-crypton-x509-devel-1.9.1-1.3.aarch64.rpm"
RPM_HASH = "5c4b63da3e7fdeee76b5b452ece76ebd2b0322ca941e07a8c4769d86d26e32b7f1ae662a5bc5dad04b9c1a7505c5513d0a5e74c2a146ebc0f7983eed606a93b7"

RPROVIDES:${PN} += "ghc-crypton-x509-devel \
ghc-devel-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-x509 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1 \
ghc-devel-crypton-asn1-parse-0.10.0-K1qlVX8i1EIBhJkdyloxeJ \
ghc-devel-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-devel-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-devel-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
