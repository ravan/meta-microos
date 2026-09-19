SUMMARY = "Haskell boring library development files"
DESCRIPTION = "This package provides the Haskell boring library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-boring-devel-0.2.2.1-1.3.aarch64.rpm"
RPM_HASH = "a1cd2641045b265bb01a21ea35921aef2e69bfc7bd05d8d86a90fbcf7a20902c3ffeef518104f363f9623ce78f8f515924a70af75f31e4c3efcabb39a245245c"

RPROVIDES:${PN} += "ghc-boring-devel \
ghc-devel-boring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-boring \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7"

inherit rpm
