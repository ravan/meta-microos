SUMMARY = "Haskell data-fix library development files"
DESCRIPTION = "This package provides the Haskell data-fix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-data-fix-devel-0.3.4-3.3.aarch64.rpm"
RPM_HASH = "14a121a33e581264a5fa1b44bc09284b274ac7a68f9668c1daef17b81ae30ca35c30ea729e021f58eb5b99c33c14ccd4cfe485c626867c502fb20ee20d50e74a"

RPROVIDES:${PN} += "ghc-data-fix-devel \
ghc-devel-data-fix-0.3.4-CgM6sqdDt42GirAgfXjM4z"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-fix \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr"

inherit rpm
