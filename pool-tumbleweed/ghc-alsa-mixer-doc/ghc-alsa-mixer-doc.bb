SUMMARY = "Haskell alsa-mixer library documentation"
DESCRIPTION = "This package provides the Haskell alsa-mixer library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.1"

RPM_NAME = "ghc-alsa-mixer-doc-0.3.0.1-1.20.noarch.rpm"
RPM_HASH = "7c6fa9b94c979833d9b64a179340b6b05bc229e229e6e8acaad3d122167e5a56ea778b33213b8501e6d6b3e2ff3241b3ab51dffbfd89c9350ecd82b79b41744c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-alsa-mixer-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
