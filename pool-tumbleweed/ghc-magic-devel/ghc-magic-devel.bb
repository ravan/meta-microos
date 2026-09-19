SUMMARY = "Haskell magic library development files"
DESCRIPTION = "This package provides the Haskell magic library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "ghc-magic-devel-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "925b7edc41dd17192b4e04770fa479c18d8624379cbb3ea8c1de34abde3c4d9e55a997671f4202b98b61221c92678a78db4c7b2c12a8d76afebbcc0ac128397b"

RPROVIDES:${PN} += "ghc-devel-magic-1.1.2-FUYWSwmPGvH2Sd1F0sVlnx \
ghc-magic-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-magic \
pkgconfig \
pkgconfig-libmagic"

inherit rpm
