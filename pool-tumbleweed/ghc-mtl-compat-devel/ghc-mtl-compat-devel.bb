SUMMARY = "Haskell mtl-compat library development files"
DESCRIPTION = "This package provides the Haskell mtl-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-mtl-compat-devel-0.2.2-1.6.aarch64.rpm"
RPM_HASH = "c1a3d9abaac21132e6fc6f170919aefa1888a990ee91b9d87fbeefa08ef1ab7c09a2df424c1168456940738b37e9f8a3a4a6a775f76d0153f6fcb3cc16501c17"

RPROVIDES:${PN} += "ghc-devel-mtl-compat-0.2.2-H6TKCIJDkxWL79zjJ8L89C \
ghc-mtl-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-mtl-2.3.2-37ef \
ghc-mtl-compat"

inherit rpm
