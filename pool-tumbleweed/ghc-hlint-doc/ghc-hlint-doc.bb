SUMMARY = "Haskell hlint library documentation"
DESCRIPTION = "This package provides the Haskell hlint library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.10"

RPM_NAME = "ghc-hlint-doc-3.10-1.17.noarch.rpm"
RPM_HASH = "b0a71ded084c5f77ac782257abc0f9961bd06404d96c67846d10a610bca6038762fe9131e0ceec1254addbccd797b5b6a49f161a40c4a9b42debbc29f27a1753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hlint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
