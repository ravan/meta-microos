SUMMARY = "Haskell scientific library documentation"
DESCRIPTION = "This package provides the Haskell scientific library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.8.1"

RPM_NAME = "ghc-scientific-doc-0.3.8.1-1.3.noarch.rpm"
RPM_HASH = "ee66152014c4c4cc8c5e9c1eb83bbe8eb765739591cc2e6c263e474b861856f47484bab7e985ce973a5adb45a0591d3c35cabfc73633add39ef0a3544f4d86e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-scientific-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
