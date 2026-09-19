SUMMARY = "Haskell easy-file library documentation"
DESCRIPTION = "This package provides the Haskell easy-file library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-doc-0.2.5-1.32.noarch.rpm"
RPM_HASH = "d861080d90f06cda3bc5c1e6af19753e41adf24f5e2716450b1da74a51adf8a20519d1ecd0eb403dfe3cd375da0a1a7ef5338a09b11bc64cc4935cc1d9b740ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-easy-file-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
