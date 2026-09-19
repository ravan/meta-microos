SUMMARY = "Haskell mime-types library documentation"
DESCRIPTION = "This package provides the Haskell mime-types library documentation."
LICENSE = "MIT"

PV = "0.1.2.2"

RPM_NAME = "ghc-mime-types-doc-0.1.2.2-1.2.noarch.rpm"
RPM_HASH = "629a210e24b420b8ae8fe7a88c31d996b601ae4a568c99133fdc78ffa01b780ca8060189d1f783a4bec496823f3abfea5dc6a904379499f4c0150dd5c3d3a409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mime-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
