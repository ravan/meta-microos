SUMMARY = "Haskell Decimal library development files"
DESCRIPTION = "This package provides the Haskell Decimal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-devel-0.5.2-2.19.aarch64.rpm"
RPM_HASH = "7c2d31ebea45e803c0191c7048cec960527e2d1e0708453874c8ae1cbb0b75753f92a98ce4342965afb0babb12f53ab38dbfc66a30aa4ecd3e91427523a826f7"

RPROVIDES:${PN} += "ghc-Decimal-devel \
ghc-devel-Decimal-0.5.2-1UdB985IcTF52sAwbBdCjx"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Decimal \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350"

inherit rpm
