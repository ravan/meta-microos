SUMMARY = "Haskell async library documentation"
DESCRIPTION = "This package provides the Haskell async library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.6"

RPM_NAME = "ghc-async-doc-2.2.6-1.3.noarch.rpm"
RPM_HASH = "7cb227333939b348399bb85da2b6936f344fc6b35193e78e07683822d436d3d760d2820b26d70bad741a9df7e51770e32d32478a0b70aebd436043a34a127661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-async-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
