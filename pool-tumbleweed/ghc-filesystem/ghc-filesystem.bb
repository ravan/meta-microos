SUMMARY = "Shared directories for Haskell documentation"
DESCRIPTION = "This package provides some common directories used for \
Haskell libraries documentation."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-filesystem-9.12.4-1.3.noarch.rpm"
RPM_HASH = "3bd384aefb584d8294f0a95bc5522967c28b91fcd0584e3e542541716b9e82fd4799539f9052b3e94515845ef6e7d247747dc4bea1b6e165ad1f6d01fe20c7f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filesystem"

RDEPENDS:${PN} += ""

inherit rpm
