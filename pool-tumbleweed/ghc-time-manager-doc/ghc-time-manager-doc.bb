SUMMARY = "Haskell time-manager library documentation"
DESCRIPTION = "This package provides the Haskell time-manager library documentation."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "ghc-time-manager-doc-0.2.4-1.7.noarch.rpm"
RPM_HASH = "067f1999679f45f5bd728248af18260ff7f0ad800cb5e54817b6eca7e0634c591235458b5e9907b62971a13b3b9fafc57b406816c09f0dfd1274643647a640b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-manager-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
