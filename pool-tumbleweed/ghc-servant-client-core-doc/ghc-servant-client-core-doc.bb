SUMMARY = "Haskell servant-client-core library documentation"
DESCRIPTION = "This package provides the Haskell servant-client-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-client-core-doc-0.20.3.0-3.16.noarch.rpm"
RPM_HASH = "2dfdf93f1c11c4c0669af3b022d0886b7ab52f23cf0d8b0c1f0e289b06c58612a57b8562a1463a84d0582a17e07c4cc85e5cc8c57ca417d3f905bb1eae5e3a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-client-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
