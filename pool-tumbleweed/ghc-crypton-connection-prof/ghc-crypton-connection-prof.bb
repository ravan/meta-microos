SUMMARY = "Haskell crypton-connection profiling library"
DESCRIPTION = "This package provides the Haskell crypton-connection profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-crypton-connection-prof-0.4.6-1.3.aarch64.rpm"
RPM_HASH = "817eb5247ebd9874213ee03ab173d65cfe9c07397ab9ed46d208fc05180225185b5cb8b04927ba2b9d504a5f154bb5ab406dfdddba5623410b1205e5c921270b"

RPROVIDES:${PN} += "ghc-crypton-connection-prof \
ghc-prof-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y"

RDEPENDS:${PN} += "ghc-crypton-connection-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-socks-0.6.2-ArLwOvrWYIxHawSNyZavl9 \
ghc-prof-crypton-x509-store-1.9.0-El9KTdTEmh914oZcyIi6oh \
ghc-prof-crypton-x509-system-1.9.0-Kgk4Pc4QdTa954ljhsveQp \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh"

inherit rpm
