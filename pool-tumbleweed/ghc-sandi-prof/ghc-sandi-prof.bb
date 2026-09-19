SUMMARY = "Haskell sandi profiling library"
DESCRIPTION = "This package provides the Haskell sandi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-prof-0.5-5.60.aarch64.rpm"
RPM_HASH = "52940062d6fd759c622b8beb031cf9be768d7635e97cd04b60b1517cf67dac50e354a1424f5857e1c9a38ac4525c107d94d288615b6f9ab413c0e77bfec8a73e"

RPROVIDES:${PN} += "ghc-prof-sandi-0.5-CSReKcZE4oMHyrsoFuQsxn \
ghc-sandi-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-exceptions-0.10.12-f655 \
ghc-sandi-devel"

inherit rpm
