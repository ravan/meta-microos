SUMMARY = "Haskell ansi-terminal-types library documentation"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-ansi-terminal-types-doc-1.1.3-1.10.noarch.rpm"
RPM_HASH = "3f8a50857dbeff1b0cbce891e732a5a93a7c1d78ae6bd7e8868b039834466037b2a14760ca435c47beda17106c4d6db1a321afbe6659994c2dff973505e3a457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
