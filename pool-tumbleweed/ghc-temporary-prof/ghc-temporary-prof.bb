SUMMARY = "Haskell temporary profiling library"
DESCRIPTION = "This package provides the Haskell temporary profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-prof-1.3-6.30.aarch64.rpm"
RPM_HASH = "c7b277eaae93546b1451a36c92071a2e8c727f69b7a4816a8bf1de65181851952205b3de3fdd9a1619b56075ebe340dbfa990767bff983d21d57a7d7078be9f7"

RPROVIDES:${PN} += "ghc-prof-temporary-1.3-2Osk9MNG2oU9jER7tTbSTz \
ghc-temporary-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-temporary-devel"

inherit rpm
