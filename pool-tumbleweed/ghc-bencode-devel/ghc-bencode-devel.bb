SUMMARY = "Haskell bencode library development files"
DESCRIPTION = "This package provides the Haskell bencode library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-devel-0.6.1.1-4.35.aarch64.rpm"
RPM_HASH = "3204f986cdbbc9ab452b7981d67efb2c51856bdce7a7177312d56afb1ecff45c6b9e982f618be07020d17c61a2416e77773e7c6e36714d3934f11676e5edfd4e"

RPROVIDES:${PN} += "ghc-bencode-devel \
ghc-devel-bencode-0.6.1.1-KWSVkFpNEL1HhwrIArSQND"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bencode \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
