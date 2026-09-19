SUMMARY = "Haskell monad-loops profiling library"
DESCRIPTION = "This package provides the Haskell monad-loops profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-prof-0.4.3-11.23.aarch64.rpm"
RPM_HASH = "aec5bcc8b24be999dd1e0f6dacbc8bac56300be90d161e37a97385611e3c6584dd53fafc9ad6317e6e4390fd2816b3841e3f0c71febc7df66d06e9cfdf9b12dc"

RPROVIDES:${PN} += "ghc-monad-loops-prof \
ghc-prof-monad-loops-0.4.3-DnSFazqaMXyCc2HbLgcz0b"

RDEPENDS:${PN} += "ghc-monad-loops-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
