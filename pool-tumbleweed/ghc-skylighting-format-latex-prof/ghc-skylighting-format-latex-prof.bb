SUMMARY = "Haskell skylighting-format-latex profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-prof-0.1-2.79.aarch64.rpm"
RPM_HASH = "1db3a9db8451f33c7c916210d6176b1641af7711b56a48e13806046a678ac14b5042c40c4ab08839046c8c89a72050d5af5d18647dae4ea5dadb248885254b7c"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-latex-0.1-1TNSCzX0YGK3X45liMm1xQ \
ghc-skylighting-format-latex-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-prof-text-2.1.4-cf23 \
ghc-skylighting-format-latex-devel"

inherit rpm
