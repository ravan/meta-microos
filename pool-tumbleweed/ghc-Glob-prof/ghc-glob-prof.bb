SUMMARY = "Haskell Glob profiling library"
DESCRIPTION = "This package provides the Haskell Glob profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-prof-0.10.2-3.35.aarch64.rpm"
RPM_HASH = "aef2c53cf9ae80f27e080f685fedc9f8b97ebee44cf0a328ecf46af00c981726fdcce28ca5ed14c9e1c922b60881dc86073a4c9b884dce6d850de54a61547719"

RPROVIDES:${PN} += "ghc-Glob-prof \
ghc-prof-Glob-0.10.2-AdAJXGIwHNdL3rTZGPrj2r"

RDEPENDS:${PN} += "ghc-Glob-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-dlist-1.0-24EafZnoZk8EE7HqnP59eC \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
