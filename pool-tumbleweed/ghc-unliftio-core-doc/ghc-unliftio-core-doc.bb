SUMMARY = "Haskell unliftio-core library documentation"
DESCRIPTION = "This package provides the Haskell unliftio-core library documentation."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-doc-0.2.1.0-3.23.noarch.rpm"
RPM_HASH = "df3ef0c8d65ed4d94d0b9216337004d36506ce94ed50c1cdd72006f02ea13b75c07abca0e23927070e566ca97dda7d6cefb91434c5b4c8743d13826f30944a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unliftio-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
