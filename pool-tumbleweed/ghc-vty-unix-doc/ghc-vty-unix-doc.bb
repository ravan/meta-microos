SUMMARY = "Haskell vty-unix library documentation"
DESCRIPTION = "This package provides the Haskell vty-unix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.0"

RPM_NAME = "ghc-vty-unix-doc-0.3.0.0-1.3.noarch.rpm"
RPM_HASH = "536bedd2439358527c29f579d16b0db4b565f97c3aa93bc97e7f0ccb0bc8cf1589f4e8d7237d730b5d7321eaa2505ed8b7174c947f55a009d80556ddc4b9b690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vty-unix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
