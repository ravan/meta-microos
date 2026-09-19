SUMMARY = "Haskell utility-ht library development files"
DESCRIPTION = "This package provides the Haskell utility-ht library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.17.2"

RPM_NAME = "ghc-utility-ht-devel-0.0.17.2-1.16.aarch64.rpm"
RPM_HASH = "d74a3ae6481b4f78bcfbcc9ae735deec90e5043b8f46acec10f82362efc5ee91911232e2f5b2b2147413fdc3d320b7a42b430acdc1e84d5cfe800b5ab618ca2d"

RPROVIDES:${PN} += "ghc-devel-utility-ht-0.0.17.2-E9mYTmSklQHJf02bWgeDJF \
ghc-utility-ht-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-utility-ht"

inherit rpm
