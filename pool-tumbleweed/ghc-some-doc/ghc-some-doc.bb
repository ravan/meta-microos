SUMMARY = "Haskell some library documentation"
DESCRIPTION = "This package provides the Haskell some library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "ghc-some-doc-1.0.6-6.3.noarch.rpm"
RPM_HASH = "a3eb530ee77a368dd9c89a90e4fc5899308036ece23cf3d0070fe2c942965b605687839d4b8c9b37dd7c5fb6455b216f364c42bcd4edf6d06473aae0e583df6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-some-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
