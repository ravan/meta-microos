SUMMARY = "Haskell cryptohash-sha1 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-doc-0.11.101.0-8.15.noarch.rpm"
RPM_HASH = "f14bc24b5d5b55de916bd66855586dd5aff450b3bddc1e8aa4c120891c83be381b61504d308e213eb81813465e9830823c3406edacdb5fd5c2d48dcb534fc39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
