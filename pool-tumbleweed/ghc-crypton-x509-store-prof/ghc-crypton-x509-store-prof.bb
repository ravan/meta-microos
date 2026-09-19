SUMMARY = "Haskell crypton-x509-store profiling library"
DESCRIPTION = "This package provides the Haskell crypton-x509-store profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "ghc-crypton-x509-store-prof-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "239d68230d4a905ad685f9d4efa2734fc0d587b7a0f4ccdb5e8df28031bf571aaf9a90dd5b628df33e9d50b680a46ced52abfa0c77c6c86b5b9f38238f64ea7e"

RPROVIDES:${PN} += "ghc-crypton-x509-store-prof \
ghc-prof-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh"

RDEPENDS:${PN} += "ghc-crypton-x509-store-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-crypton-asn1-encoding-0.10.0-DTeXuctQn7g1wG1ZsDTxi1 \
ghc-prof-crypton-asn1-types-0.4.1-LmR9a0v0hFeGm5Drmsi7UB \
ghc-prof-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij \
ghc-prof-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
