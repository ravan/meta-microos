SUMMARY = "Haskell transformers-base library development files"
DESCRIPTION = "This package provides the Haskell transformers-base library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.6.1"

RPM_NAME = "ghc-transformers-base-devel-0.4.6.1-1.3.aarch64.rpm"
RPM_HASH = "53cd8e8bc23a60bce08a63b4ea71a35cc13838ff622d4b291e65488235ecfecafd92e63fd03040d96cdf3241df085ce3fd93d12de3d65883ae973ee254ff1934"

RPROVIDES:${PN} += "ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-transformers-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-transformers-base"

inherit rpm
