SUMMARY = "Haskell call-stack library documentation"
DESCRIPTION = "This package provides the Haskell call-stack library documentation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-doc-0.4.0-2.35.noarch.rpm"
RPM_HASH = "9a684b31678cb4394a7c967c8422e5e478196c4840625bc93660a2b6d6e9ae2856c2534c34b038fe3daa5a2e9042a939b3ae89e708959aaa5000a1d828a3cfe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-call-stack-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
