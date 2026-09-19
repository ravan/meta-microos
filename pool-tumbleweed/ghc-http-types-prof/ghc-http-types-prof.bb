SUMMARY = "Haskell http-types profiling library"
DESCRIPTION = "This package provides the Haskell http-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.12.5"

RPM_NAME = "ghc-http-types-prof-0.12.5-1.3.aarch64.rpm"
RPM_HASH = "ad2a25f78227c6042f6b1e5909fdb2d5d61c3f2e8e9d4f24de9ce9adc743315eef2cffa6dbbd030e2af454ec12d727f84051dff7e1e09366d6c0c1cf5a0c7622"

RPROVIDES:${PN} += "ghc-http-types-prof \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM"

RDEPENDS:${PN} += "ghc-http-types-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-text-2.1.4-cf23"

inherit rpm
