SUMMARY = "Haskell text-ansi library documentation"
DESCRIPTION = "This package provides the Haskell text-ansi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.1"

RPM_NAME = "ghc-text-ansi-doc-0.3.0.1-4.2.noarch.rpm"
RPM_HASH = "a0a92d7b93dc2ee7ec1aa96863c4477b4646ac77e4090634d2e9fc9a2ebc78d61cd0b6a125e6f4e15089f96119d5261a379793001f889c9a197bf12a9b62793d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-ansi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
