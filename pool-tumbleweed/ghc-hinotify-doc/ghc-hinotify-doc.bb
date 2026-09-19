SUMMARY = "Haskell hinotify library documentation"
DESCRIPTION = "This package provides the Haskell hinotify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-hinotify-doc-0.4.2-1.13.noarch.rpm"
RPM_HASH = "cfd0bed0fba44e1992f838529ccabebe383140c1a8303bc7f7c594d4375e379c7dbff65df799f298611ee4972d53bfaf78f0575e86a3d35fba1802a9d0a779cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hinotify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
