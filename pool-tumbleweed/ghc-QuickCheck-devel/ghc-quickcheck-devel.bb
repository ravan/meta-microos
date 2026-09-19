SUMMARY = "Haskell QuickCheck library development files"
DESCRIPTION = "This package provides the Haskell QuickCheck library development files."
LICENSE = "BSD-3-Clause"

PV = "2.15.0.1"

RPM_NAME = "ghc-QuickCheck-devel-2.15.0.1-2.15.aarch64.rpm"
RPM_HASH = "dd8ec03478a5bc1b945e2a4682790b158495ccea5c6185498f31f1ec6d99388adf2b35c6dcb788b93c344e06849b3e34132cd75265a349daeaced13bcb0bdfd5"

RPROVIDES:${PN} += "ghc-QuickCheck-devel \
ghc-devel-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-QuickCheck \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-splitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
