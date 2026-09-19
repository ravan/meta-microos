SUMMARY = "Haskell syb library development files"
DESCRIPTION = "This package provides the Haskell syb library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "ghc-syb-devel-0.7.4-1.3.aarch64.rpm"
RPM_HASH = "6062e86a1d0489d0543e7d610b9fc08261946f7beab246c7bea6ee45c0f90708076daf3bd71763a821d528957a1eaeabd037843773dfed1d4461327cb2c3c49a"

RPROVIDES:${PN} += "ghc-devel-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-syb-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-syb"

inherit rpm
