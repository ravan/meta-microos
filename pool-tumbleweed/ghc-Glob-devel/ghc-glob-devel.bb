SUMMARY = "Haskell Glob library development files"
DESCRIPTION = "This package provides the Haskell Glob library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-devel-0.10.2-3.35.aarch64.rpm"
RPM_HASH = "981c8c4d70f5d1fdf823c225637807e089c134e9e4210bacae5cb2631208e6d4e1d9958745e4151ff823a376a1dfc8bb5577ca0730ecbc74e4aeeaa1aabce6de"

RPROVIDES:${PN} += "ghc-Glob-devel \
ghc-devel-Glob-0.10.2-AdAJXGIwHNdL3rTZGPrj2r"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Glob \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-dlist-1.0-24EafZnoZk8EE7HqnP59eC \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
