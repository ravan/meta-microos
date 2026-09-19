SUMMARY = "Haskell basement library documentation"
DESCRIPTION = "This package provides the Haskell basement library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-doc-0.0.16-1.32.noarch.rpm"
RPM_HASH = "75d301850ed1daac2aef91cbe0adc740ad43d566b9592d2701cebdcfdb5af310a69596efbf88b4a7e086b20eaf3446cbfc563a7a157b788c0f3efc85b31216b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-basement-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
