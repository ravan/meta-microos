SUMMARY = "Haskell SHA library documentation"
DESCRIPTION = "This package provides the Haskell SHA library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-doc-1.6.4.4-8.23.noarch.rpm"
RPM_HASH = "87634bffc192aa5a3cbe3c1b66de31a2fd4fcee3716689985b5782ea4cdec8992dc431581674e6aaddccb7f18369ed0326c2b6cc6cbacbcc723ebf61a6e3dc20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-SHA-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
