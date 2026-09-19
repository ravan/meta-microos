SUMMARY = "Haskell crypton-x509-store library development files"
DESCRIPTION = "This package provides the Haskell crypton-x509-store library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "ghc-crypton-x509-store-devel-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "b835e9a7027603f193c8bf706c7c1c06c1d9998a9e2bd7a7701bc6cec9e216e812dfd7dee6ad4bd9af7b529a4ab012179dc88de4a6517c38cdf12acbd58360f8"

RPROVIDES:${PN} += "ghc-crypton-x509-store-devel \
ghc-devel-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-x509-store \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1 \
ghc-devel-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-devel-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij \
ghc-devel-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-unix-2.8.8.0-178a"

inherit rpm
