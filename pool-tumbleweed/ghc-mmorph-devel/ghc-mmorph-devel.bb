SUMMARY = "Haskell mmorph library development files"
DESCRIPTION = "This package provides the Haskell mmorph library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-mmorph-devel-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "c8172eaf2c4590256942cfe05d4b780b82276389253f6d662a45bef44e8217d644ab481293a85df3ee6c3c3577585fd88affc793b249fdc1110bc8bf2a731f81"

RPROVIDES:${PN} += "ghc-devel-mmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h \
ghc-mmorph-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-mmorph"

inherit rpm
