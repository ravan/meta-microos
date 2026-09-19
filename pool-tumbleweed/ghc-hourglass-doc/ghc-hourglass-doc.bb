SUMMARY = "Haskell hourglass library documentation"
DESCRIPTION = "This package provides the Haskell hourglass library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-doc-0.2.12-8.23.noarch.rpm"
RPM_HASH = "799effaf9e874fb394b86bb299bc532e577712fb64445bf5d65f2d432b0176ca7053d7652d81007b8879a52ecfbf568b41aa0edf8cd54861930beadeb4dc04e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hourglass-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
