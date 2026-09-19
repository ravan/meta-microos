SUMMARY = "Haskell Cabal library documentation"
DESCRIPTION = "This package provides the Haskell Cabal library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.14.2.0"

RPM_NAME = "ghc-Cabal-doc-3.14.2.0-1.3.noarch.rpm"
RPM_HASH = "8df2c60c071f1c7c860158706183eaeb23611fabd4b9e196985e68125d286ddbf43af82a58052f00c18de416e6607739720716862e667b648ec1066bc051e8e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
