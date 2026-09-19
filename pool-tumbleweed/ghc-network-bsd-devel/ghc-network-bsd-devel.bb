SUMMARY = "Haskell network-bsd library development files"
DESCRIPTION = "This package provides the Haskell network-bsd library development files."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-devel-2.8.1.0-9.16.aarch64.rpm"
RPM_HASH = "6bd4dbf6c571570880471ac06b7d017bd7909efb185972b4e58c4b56e368c8d07c4cea2bf095f41a7635a125dc4e31ec78ce6522d5df4f607746935db241027d"

RPROVIDES:${PN} += "ghc-devel-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx \
ghc-network-bsd-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-network-bsd"

inherit rpm
