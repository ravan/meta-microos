SUMMARY = "Haskell socks library documentation"
DESCRIPTION = "This package provides the Haskell socks library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-doc-0.6.1-6.36.noarch.rpm"
RPM_HASH = "1dbb8889243232abd1958bdb0faa53003168b2b480b7206b8969d8c058bf8131c6a474b10bb5e359fba3367e96e92530b25940356756cb08cd420c657c4edc61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-socks-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
