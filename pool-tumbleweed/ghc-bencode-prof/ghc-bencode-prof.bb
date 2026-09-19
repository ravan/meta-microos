SUMMARY = "Haskell bencode profiling library"
DESCRIPTION = "This package provides the Haskell bencode profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-prof-0.6.1.1-4.35.aarch64.rpm"
RPM_HASH = "832fc38932ff8ef62cb0e621fa77b1b0de4789572cdec43777a6b3d64684b551ba6b702fd06cb06711199431d197c287ad8c6c393e530fd5101f786caf4e02d9"

RPROVIDES:${PN} += "ghc-bencode-prof \
ghc-prof-bencode-0.6.1.1-KWSVkFpNEL1HhwrIArSQND"

RDEPENDS:${PN} += "ghc-bencode-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
