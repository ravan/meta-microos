SUMMARY = "Haskell bloomfilter library documentation"
DESCRIPTION = "This package provides the Haskell bloomfilter library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.3"

RPM_NAME = "ghc-bloomfilter-doc-2.0.1.3-1.7.noarch.rpm"
RPM_HASH = "10d9116addaea2614db665d2ab0a43bba2e9b6ed3c6e86972673a1f5e78307ed76aaec72cf40258816ccc10aae50aeb4924457551dd802368b05c4d915dd11d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bloomfilter-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
