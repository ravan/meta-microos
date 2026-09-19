SUMMARY = "Haskell echo library documentation"
DESCRIPTION = "This package provides the Haskell echo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-doc-0.1.4-2.23.noarch.rpm"
RPM_HASH = "d2ea23d960d3fac3528cf45c0075b69a16f9d9f3b625d3f15808984d6c2e8ae9c7792b39461a7bc1dc37f4b4229b664a1cf98f48ec5ceacc9b85232ea1df9e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-echo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
