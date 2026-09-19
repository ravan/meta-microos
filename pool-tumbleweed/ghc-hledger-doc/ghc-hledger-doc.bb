SUMMARY = "Haskell hledger library documentation"
DESCRIPTION = "This package provides the Haskell hledger library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-doc-1.52.1-1.5.noarch.rpm"
RPM_HASH = "5944a6e210c420afde741d6c99ddb9e1790aa15a5aa5b9584135fb3690c166bd41e2ada9d90c14086c373261415e1871e6c47cd45c26495ce9a82972c01fef2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
