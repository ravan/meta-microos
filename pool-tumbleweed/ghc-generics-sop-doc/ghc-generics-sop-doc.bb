SUMMARY = "Haskell generics-sop library documentation"
DESCRIPTION = "This package provides the Haskell generics-sop library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.4"

RPM_NAME = "ghc-generics-sop-doc-0.5.1.4-2.3.noarch.rpm"
RPM_HASH = "af2152fe9839fe6d7bd53ca23dba25ea1b3178da6988f2be5e462c9876981572478120b702e29e235090f5c0ca9ba9a1827acc76dc106284fc21a16b05cab495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-generics-sop-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
