SUMMARY = "Haskell servant library documentation"
DESCRIPTION = "This package provides the Haskell servant library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-doc-0.20.3.0-4.5.noarch.rpm"
RPM_HASH = "26084dcbc9eb4fec914f06cf7fd0f0b6c2e28da96a61d3900e63bb7cdae8db3e494aad4dde808f30260e5b77bcf88abce8a9dfda55649b6baa2adaead9f28a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
