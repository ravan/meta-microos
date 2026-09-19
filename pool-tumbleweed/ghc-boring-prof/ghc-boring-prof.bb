SUMMARY = "Haskell boring profiling library"
DESCRIPTION = "This package provides the Haskell boring profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-boring-prof-0.2.2.1-1.3.aarch64.rpm"
RPM_HASH = "812b762fafe468fc78deac06ece114bad020ab5033ad69ba5a0bc0cf4620c6ed7e0f278c0fddd4aa7b01474fc9bc6e2df5f29923c752d9deb5b7b70a368e6b6b"

RPROVIDES:${PN} += "ghc-boring-prof \
ghc-prof-boring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw"

RDEPENDS:${PN} += "ghc-boring-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7"

inherit rpm
