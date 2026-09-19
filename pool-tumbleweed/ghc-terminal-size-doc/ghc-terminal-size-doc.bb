SUMMARY = "Haskell terminal-size library documentation"
DESCRIPTION = "This package provides the Haskell terminal-size library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-doc-0.3.4-2.16.noarch.rpm"
RPM_HASH = "7efd7ce05337453403d811156552677cfab6cc6d1cf0cea138469e5b854413762428e86245f948b513700bd0b1d86e752012ce6e6040502601e0e4f938156699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminal-size-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
