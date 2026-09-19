SUMMARY = "Haskell SafeSemaphore profiling library"
DESCRIPTION = "This package provides the Haskell SafeSemaphore profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-prof-0.10.1-5.35.aarch64.rpm"
RPM_HASH = "d525cac9217bbde33ddb25d6f2d28726800590f96db7452fd6f11ba9ecccb12a768d45a493f23fbc4b45441369ddf94d4af2851291a5691497c76e45ec0513e6"

RPROVIDES:${PN} += "ghc-SafeSemaphore-prof \
ghc-prof-SafeSemaphore-0.10.1-KAvbZbWmNg73dAA9KjvouK"

RDEPENDS:${PN} += "ghc-SafeSemaphore-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-stm-2.5.3.1-6d74"

inherit rpm
