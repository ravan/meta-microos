SUMMARY = "Haskell aws library documentation"
DESCRIPTION = "This package provides the Haskell aws library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.25.3"

RPM_NAME = "ghc-aws-doc-0.25.3-1.3.noarch.rpm"
RPM_HASH = "4f4f07ae031a7d939a666257f193dd3696d1a67ded76ff68962b54d76566a4c12a9ec05d36478076d64e17794012ba8aa9942efda0d4f89e9c5c325792822042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aws-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
