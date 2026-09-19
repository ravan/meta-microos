SUMMARY = "Haskell QuickCheck profiling library"
DESCRIPTION = "This package provides the Haskell QuickCheck profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.15.0.1"

RPM_NAME = "ghc-QuickCheck-prof-2.15.0.1-2.15.aarch64.rpm"
RPM_HASH = "9a3f6f0d4c839636b30d4ec29c203fc99254439ef8ea464d6d6e92808a3c4035c6cffd6028dad9913e6bb19b24f46eb1cd761efac1b6146609bb3e5c7f034f48"

RPROVIDES:${PN} += "ghc-QuickCheck-prof \
ghc-prof-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J"

RDEPENDS:${PN} += "ghc-QuickCheck-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-splitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
