SUMMARY = "Haskell setlocale library documentation"
DESCRIPTION = "This package provides the Haskell setlocale library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-doc-1.0.0.10-8.5.noarch.rpm"
RPM_HASH = "53841d403b0af2d40dd4eacfaf19a370dc6a19d3e6aecb11c906f734a85d897b8b75ae68197a79eee13711c27131b7f5999e8ea23250543cae30e860221eba3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-setlocale-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
