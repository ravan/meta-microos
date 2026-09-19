SUMMARY = "Haskell byteorder library documentation"
DESCRIPTION = "This package provides the Haskell byteorder library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-doc-1.0.4-4.19.noarch.rpm"
RPM_HASH = "dcae82b8d646fe482bd2c2b4c19138f577885986a946067abc6fcbc4c25117552b6226cb7ae4315626f6b21ae0ec4fa637ffb7292fd395c5b983c435007544f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-byteorder-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
