SUMMARY = "Haskell sop-core library documentation"
DESCRIPTION = "This package provides the Haskell sop-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-doc-0.5.0.2-8.3.noarch.rpm"
RPM_HASH = "40f526b0a5388afb6c8020a120ae82ec4759416998d69dce9461cafe60c47a2d58e04be84807552d54f77210f70a4ec96e965ea686f48fdddcf94ab4f63e3230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-sop-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
