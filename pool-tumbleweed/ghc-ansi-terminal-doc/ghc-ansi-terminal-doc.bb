SUMMARY = "Haskell ansi-terminal library documentation"
DESCRIPTION = "This package provides the Haskell ansi-terminal library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "ghc-ansi-terminal-doc-1.1.5-1.7.noarch.rpm"
RPM_HASH = "6576f1da143253cca44869f8703615e8b6cce7c6a1d5b62dd35ee33836afe6772e4043924270c263444611f9e5d8db70c15f0978232b97f9f5bf5e83780ec191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-terminal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
