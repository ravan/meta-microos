SUMMARY = "Haskell crypton-x509-system profiling library"
DESCRIPTION = "This package provides the Haskell crypton-x509-system profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "ghc-crypton-x509-system-prof-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "cfe490f37ecb59bd8f09032f7b831652ce256ac610cb8031ce832fc749169390e6a5cc1052bda35cf7fad26afe2008c0df0b8198a9c111cdd38c468d0c014678"

RPROVIDES:${PN} += "ghc-crypton-x509-system-prof \
ghc-prof-crypton-x509-system-1.9.0-Kgk4Pc4QdTa954ljhsveQp"

RDEPENDS:${PN} += "ghc-crypton-x509-system-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij \
ghc-prof-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-prof-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-process-1.6.26.1-905d"

inherit rpm
