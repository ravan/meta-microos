SUMMARY = "Haskell parsec-numbers library documentation"
DESCRIPTION = "This package provides the Haskell parsec-numbers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-doc-0.1.0-7.19.noarch.rpm"
RPM_HASH = "a0cf4eb3b5dc264b54c9339ab16bdf6593c8ce7e6156c4474093d783189bcb67f14ee4a24663bb67057aac7ab768f225774a9c155de7b9cd40f1014751e500ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parsec-numbers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
