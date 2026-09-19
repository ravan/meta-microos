SUMMARY = "Haskell dlist library development files"
DESCRIPTION = "This package provides the Haskell dlist library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-devel-1.0-5.16.aarch64.rpm"
RPM_HASH = "fab34a03a11d77a5f592201ff856a0ae20cde8d4fa39aae391e720bc25468fd842f1e7770dcb1af34eff2c408bb6f282a646842b363252266da7312e47ee5aff"

RPROVIDES:${PN} += "ghc-devel-dlist-1.0-24EafZnoZk8EE7HqnP59eC \
ghc-dlist-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-dlist"

inherit rpm
