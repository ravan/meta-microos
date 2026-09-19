SUMMARY = "Haskell http-conduit library documentation"
DESCRIPTION = "This package provides the Haskell http-conduit library documentation."
LICENSE = "BSD-2-Clause"

PV = "2.3.9.1"

RPM_NAME = "ghc-http-conduit-doc-2.3.9.1-2.5.noarch.rpm"
RPM_HASH = "a0d8e610b106c2cc071adcb62bf4f1f198d554e18d97b95caddcc2509f9a4a83f7fc7b375a3b6d05098c7b0d6bf0f6aff6f9a3fd39cc19fb4c83d0b52fd48534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
