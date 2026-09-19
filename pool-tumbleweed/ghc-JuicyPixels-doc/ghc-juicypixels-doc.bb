SUMMARY = "Haskell JuicyPixels library documentation"
DESCRIPTION = "This package provides the Haskell JuicyPixels library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.3.9"

RPM_NAME = "ghc-JuicyPixels-doc-3.3.9-2.3.noarch.rpm"
RPM_HASH = "000c92568b6e906af29f5ede10dec2553e3969587c3676fa1423e0eb7f7d2670bb136697b1147fb06cfc71e0ddf3e34bcbe66a06195225b46a614aa20be1ce7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-JuicyPixels-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
