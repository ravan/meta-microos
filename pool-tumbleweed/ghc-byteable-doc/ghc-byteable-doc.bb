SUMMARY = "Haskell byteable library documentation"
DESCRIPTION = "This package provides the Haskell byteable library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-doc-0.1.1-12.19.noarch.rpm"
RPM_HASH = "ffb5d8b96d2aedbdddbe6810e61096a27e3f7e97e993e20120bea66c9f086f5ad0636ef957a6f6dcc9bcc9528633fcf6c267e59822d9da9394cde157e32fef95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-byteable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
