SUMMARY = "Haskell pem library documentation"
DESCRIPTION = "This package provides the Haskell pem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-doc-0.2.4-8.31.noarch.rpm"
RPM_HASH = "c3578de28888ef27fe580b5011baf782c41b7e3899dc683babc2c0899ddef55f82c8cb6b8a6952b3ff2468a8ac5a125fc5d5eb3e034e247dc5db1e7fc87f7916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pem-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
