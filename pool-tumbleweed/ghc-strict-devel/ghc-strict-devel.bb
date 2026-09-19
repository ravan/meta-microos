SUMMARY = "Haskell strict library development files"
DESCRIPTION = "This package provides the Haskell strict library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "ghc-strict-devel-0.5.1-2.16.aarch64.rpm"
RPM_HASH = "2901b75bf30dc8fe3d5b2e6f5388b5cc43c96636eecd8c3672ffbcaca880e659556e47a0e9e34151a8732777eb5bdcffe22feec1eae82539afef3c6f991e1a22"

RPROVIDES:${PN} += "ghc-devel-strict-0.5.1-9s5NAvHzvkrI18NRIQgFhz \
ghc-strict-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-strict"

inherit rpm
