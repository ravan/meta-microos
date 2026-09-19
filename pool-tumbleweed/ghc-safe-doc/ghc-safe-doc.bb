SUMMARY = "Haskell safe library documentation"
DESCRIPTION = "This package provides the Haskell safe library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "ghc-safe-doc-0.3.21-2.25.noarch.rpm"
RPM_HASH = "98df59668b1bd7a4e1cfb26f7a0cfb4c4a9037e6def2950a5ef7369efc25805cb9b80e676418cf192855231fd333398a04839736b1f540a42d74a673642a3a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-safe-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
