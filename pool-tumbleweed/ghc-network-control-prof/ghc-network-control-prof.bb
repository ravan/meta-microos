SUMMARY = "Haskell network-control profiling library"
DESCRIPTION = "This package provides the Haskell network-control profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "ghc-network-control-prof-0.1.7-1.8.aarch64.rpm"
RPM_HASH = "17c173af908be1cc7bec205550e93498a6ec8341c1db06a15abe9099229aa20f958193cce45ed673ea5b542bdc4ff46446916781184795d3ade69916e19c3721"

RPROVIDES:${PN} += "ghc-network-control-prof \
ghc-prof-network-control-0.1.7-A85ociXgUcsEREzO9qpors"

RDEPENDS:${PN} += "ghc-network-control-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-psqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu \
ghc-prof-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q"

inherit rpm
