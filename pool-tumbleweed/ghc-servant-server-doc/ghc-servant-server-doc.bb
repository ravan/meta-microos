SUMMARY = "Haskell servant-server library documentation"
DESCRIPTION = "This package provides the Haskell servant-server library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-server-doc-0.20.3.0-3.6.noarch.rpm"
RPM_HASH = "a89910031addeb83659a45bca5f0e98aa001ccef0b430ec57fd485ac0ff2cfa97cf80770a3d25847f7e44a0838da7a110da2ea4879bbc984a57f881f830f0986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
