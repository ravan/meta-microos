SUMMARY = "Haskell cryptonite library documentation"
DESCRIPTION = "This package provides the Haskell cryptonite library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-doc-0.30-2.36.noarch.rpm"
RPM_HASH = "bfc3010e1201d8876693f8d69cb596f3db4fe1d3b36d9f6b0bbe58efa973d8d4282fa492170c17b87bb341eeece714f5c6a59f658be6c60955c451be7a0b4e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptonite-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
