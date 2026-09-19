SUMMARY = "Haskell disk-free-space profiling library"
DESCRIPTION = "This package provides the Haskell disk-free-space profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-prof-0.1.0.1-5.23.aarch64.rpm"
RPM_HASH = "4e9c6d161b30ad2b38c7326e33659e3fda987b1e58a0d20322557ea158c9eb928b219a46cae9381b54b6c2b864396cce1598bf4c44484ebc3755b188939201d4"

RPROVIDES:${PN} += "ghc-disk-free-space-prof \
ghc-prof-disk-free-space-0.1.0.1-CwfKSebfOn7JGVRYHaYrKk"

RDEPENDS:${PN} += "ghc-disk-free-space-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
