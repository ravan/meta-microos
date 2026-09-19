SUMMARY = "Haskell network-control library development files"
DESCRIPTION = "This package provides the Haskell network-control library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "ghc-network-control-devel-0.1.7-1.8.aarch64.rpm"
RPM_HASH = "9ae3feb143ffbf17b7e6d02079116f9c0fd969c55c910f334a556650466c0cc0fdad9e5b9b776709dea3efa1883cf914a4bd93270c412907bb58969079d51b90"

RPROVIDES:${PN} += "ghc-devel-network-control-0.1.7-A85ociXgUcsEREzO9qpors \
ghc-network-control-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-psqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu \
ghc-devel-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q \
ghc-network-control"

inherit rpm
