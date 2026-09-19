SUMMARY = "Haskell hslua-repl library documentation"
DESCRIPTION = "This package provides the Haskell hslua-repl library documentation."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-hslua-repl-doc-0.1.2-1.23.noarch.rpm"
RPM_HASH = "2d535107f95b5290015a6b7d1c6b670cbe584c4b729b487cf8f5ebf7d1fe5e46df0e73fffdcd965ccdcc688875298b646d5ad1beb7b2ee5baf2b7d6f76219648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-repl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
