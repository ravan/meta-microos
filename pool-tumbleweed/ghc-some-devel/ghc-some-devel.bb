SUMMARY = "Haskell some library development files"
DESCRIPTION = "This package provides the Haskell some library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "ghc-some-devel-1.0.6-6.3.aarch64.rpm"
RPM_HASH = "95ca460951b52b492368d064600fcc30dbaf4e83af4583bbf0b285a48cd84824f1ab3049029d99f851a913f6257a83a20d873907d906b347dcb81041845dd6f9"

RPROVIDES:${PN} += "ghc-devel-some-1.0.6-8u6QsVxyLEPKKVYkZL0j6j \
ghc-some-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-some"

inherit rpm
