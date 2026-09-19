SUMMARY = "Haskell Only profiling library"
DESCRIPTION = "This package provides the Haskell Only profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-prof-0.1-6.17.aarch64.rpm"
RPM_HASH = "7229b5c992a26ac9f73ca15c8548ce375d0168722e4d58a35dc9483cc7f998bd05fe0cfc7578afe6f061088849b7dcca9853ea4504ce69d5ee5f83951cd5e33e"

RPROVIDES:${PN} += "ghc-Only-prof \
ghc-prof-Only-0.1-JTlBo1y3Iulx07n0z4y7"

RDEPENDS:${PN} += "ghc-Only-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350"

inherit rpm
