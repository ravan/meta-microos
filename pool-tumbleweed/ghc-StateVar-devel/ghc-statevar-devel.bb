SUMMARY = "Haskell StateVar library development files"
DESCRIPTION = "This package provides the Haskell StateVar library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-devel-1.2.2-2.23.aarch64.rpm"
RPM_HASH = "5aaa6c48e5fde691b7a934f658dd6268d8d5bb6d937d586294656f258e80d1c01ec00ff1419529a95844045553fa8a18aae6ea83f4448cfcce5d90390710824d"

RPROVIDES:${PN} += "ghc-StateVar-devel \
ghc-devel-StateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-StateVar \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
