SUMMARY = "Haskell control-monad-free profiling library"
DESCRIPTION = "This package provides the Haskell control-monad-free profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-prof-0.6.2-4.35.aarch64.rpm"
RPM_HASH = "e9517b0c318b67c77b29da27795625ec2843e1c9fc7db6e9c5455fd1ecfaf9fac6a1d78f9b118e15077ac31763977ca4138232cf403b0438adeca26125745a83"

RPROVIDES:${PN} += "ghc-control-monad-free-prof \
ghc-prof-control-monad-free-0.6.2-INrHbxo4qSqC5LftAQgJHR"

RDEPENDS:${PN} += "ghc-control-monad-free-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
