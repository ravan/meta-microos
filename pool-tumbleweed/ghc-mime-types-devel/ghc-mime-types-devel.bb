SUMMARY = "Haskell mime-types library development files"
DESCRIPTION = "This package provides the Haskell mime-types library development files."
LICENSE = "MIT"

PV = "0.1.2.2"

RPM_NAME = "ghc-mime-types-devel-0.1.2.2-1.2.aarch64.rpm"
RPM_HASH = "76c8563954755e6f48bf5295ea93df1d4983a8aee91a174b1f6e0bb69c98f8f933442f4a76555faef6135235d776720a19d26322b0189843a7a14b7685e8f0d3"

RPROVIDES:${PN} += "ghc-devel-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-mime-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-text-2.1.4-cf23 \
ghc-mime-types"

inherit rpm
