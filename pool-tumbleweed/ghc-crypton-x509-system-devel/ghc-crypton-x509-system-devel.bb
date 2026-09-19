SUMMARY = "Haskell crypton-x509-system library development files"
DESCRIPTION = "This package provides the Haskell crypton-x509-system library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "ghc-crypton-x509-system-devel-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "f25eee2a46d58baad53a260b130d9cebd70b4a5fa7fe0f10e2e713f36658e8d47732b11ffd963cd1aefaea22d0f16488183103e6edc56b4a5145a3ca4db20f99"

RPROVIDES:${PN} += "ghc-crypton-x509-system-devel \
ghc-devel-crypton-x509-system-1.9.0-Kgk4Pc4QdTa954ljhsveQp"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-x509-system \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-pem-0.3.0-EDGHx08iNeQDGxg4A2t7ij \
ghc-devel-crypton-x509-1.9.1-haGktaKI8uFy9MudMqGII \
ghc-devel-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-process-1.6.26.1-905d"

inherit rpm
