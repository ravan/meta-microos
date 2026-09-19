SUMMARY = "Haskell alsa-core library documentation"
DESCRIPTION = "This package provides the Haskell alsa-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-doc-0.5.0.1-4.20.noarch.rpm"
RPM_HASH = "230db90e1c05ce4561e8208f149a4f0b73cffc31825321dc8648ee46bdbf6f61969874c10ccb321f603aa72366978178a9f31411870f2ff474495e08ec34f41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-alsa-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
