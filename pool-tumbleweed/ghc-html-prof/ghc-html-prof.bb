SUMMARY = "Haskell html profiling library"
DESCRIPTION = "This package provides the Haskell html profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-prof-1.0.1.2-4.19.aarch64.rpm"
RPM_HASH = "b40898cdd560353d0c0c711195ea03977153c593bab4078f8c1ecd02b6c15f0f08c83abf92417ec4d81f1d5cf5ce3c70f4dc34d0ced471dcf5d597f7255d8610"

RPROVIDES:${PN} += "ghc-html-prof \
ghc-prof-html-1.0.1.2-47pIZc0gzI25DOiguxUrYX"

RDEPENDS:${PN} += "ghc-html-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
