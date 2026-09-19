SUMMARY = "Haskell entropy library documentation"
DESCRIPTION = "This package provides the Haskell entropy library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.11"

RPM_NAME = "ghc-entropy-doc-0.4.1.11-2.3.noarch.rpm"
RPM_HASH = "d3e0b03d36e2d8ad57675cfd65501876fe6ff3e5b9eaef8d5ca7cdb2f54a9b830e195a7660d8a36ae5d96e582a325957e03c2d6189d084ff2adc9318f4c0c12e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-entropy-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
