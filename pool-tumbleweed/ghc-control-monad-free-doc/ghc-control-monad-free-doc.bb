SUMMARY = "Haskell control-monad-free library documentation"
DESCRIPTION = "This package provides the Haskell control-monad-free library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-doc-0.6.2-4.35.noarch.rpm"
RPM_HASH = "b769e63956b914497f9d175e1cb5516c21dc432b85d9f09bb5a2926520ffbabce4634cc0f8b760539c49335636da016338a15a923f7893658c243161547cef41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-control-monad-free-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
