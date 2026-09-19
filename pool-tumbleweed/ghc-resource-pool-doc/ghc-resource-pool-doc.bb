SUMMARY = "Haskell resource-pool library documentation"
DESCRIPTION = "This package provides the Haskell resource-pool library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-resource-pool-doc-0.5.0.1-1.1.noarch.rpm"
RPM_HASH = "f25d4bba837a4cfcaff1b65644a8e6ac2172b39b27e204ce9a0c9cd0e739cae3c59c7987aaa77da1721f5e7405c9999060285fb829a6fbafe8a1bdb379f9e513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resource-pool-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
