SUMMARY = "Haskell monad-control library development files"
DESCRIPTION = "This package provides the Haskell monad-control library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-devel-1.0.3.1-2.24.aarch64.rpm"
RPM_HASH = "62269e98b653b8d41d37f05dd9c016de1b306de08195ee3a908ebf7ab0b442291b422332de4b1d55c986c8e4f42bdc4a14139131a4ff487ad7b0e95b193ee3b4"

RPROVIDES:${PN} += "ghc-devel-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-monad-control-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-monad-control"

inherit rpm
