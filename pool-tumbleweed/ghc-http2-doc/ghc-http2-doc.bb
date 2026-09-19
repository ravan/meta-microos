SUMMARY = "Haskell http2 library documentation"
DESCRIPTION = "This package provides the Haskell http2 library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.3.10"

RPM_NAME = "ghc-http2-doc-5.3.10-2.9.noarch.rpm"
RPM_HASH = "020d820ab80a874a0d960639b45bcdfce7e944ba49261ae8a2da5c52a035c5679ac27eacf922046540627e90b67b5443e9661f9f7a8f594eee4167bed3ad3932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http2-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
