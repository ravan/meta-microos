SUMMARY = "Haskell crypton-conduit profiling library"
DESCRIPTION = "This package provides the Haskell crypton-conduit profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-crypton-conduit-prof-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "2711d016c1b1af99ded18b6ac507af8694a1679f05fde9ec296857bac8717df71f24317f4ce3ec11a11df838b9dda41712932ac0caf93645ace07c21d306da1b"

RPROVIDES:${PN} += "ghc-crypton-conduit-prof \
ghc-prof-crypton-conduit-0.3.0-ID9cpdbxIMIJwDEvCNr6mu"

RDEPENDS:${PN} += "ghc-crypton-conduit-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
