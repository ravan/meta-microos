SUMMARY = "Haskell exceptions library documentation"
DESCRIPTION = "This package provides the Haskell exceptions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.12"

RPM_NAME = "ghc-exceptions-doc-0.10.12-1.3.noarch.rpm"
RPM_HASH = "a2166fda9c24eff088a5f369935fa4980150126fdd8264c5b9dd4bd3156e02989433c511cbd7dec05e9b65c91ad8a3e7f2a1087a11843fdcfff9519d4f048af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
