SUMMARY = "Haskell clientsession library documentation"
DESCRIPTION = "This package provides the Haskell clientsession library documentation."
LICENSE = "MIT"

PV = "0.9.3.0"

RPM_NAME = "ghc-clientsession-doc-0.9.3.0-1.24.noarch.rpm"
RPM_HASH = "0a2b09103d98288830224eace1fc405f556b036f57cdc08b4c9731ae1e09f256e523a6afda68b1e7a16ad768acdccdf25809c15887553036bfec43888b27921c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clientsession-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
