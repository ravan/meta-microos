SUMMARY = "Haskell crypton-connection library development files"
DESCRIPTION = "This package provides the Haskell crypton-connection library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-crypton-connection-devel-0.4.6-1.3.aarch64.rpm"
RPM_HASH = "fbde0349897ea9c5655ee9d0c53c4ed767b70fdb0487804e3056eb32aa12edb419ee072387065ce1f24977f18d235b6a05f15afd1a44a3d2be04eb965fbfa02d"

RPROVIDES:${PN} += "ghc-crypton-connection-devel \
ghc-devel-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-connection \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-socks-0.6.2-ArLwOvrWYIxHawSNyZavl9 \
ghc-devel-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh \
ghc-devel-crypton-x509-system-1.9.0-Kgk4Pc4QdTa954ljhsveQp \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh"

inherit rpm
