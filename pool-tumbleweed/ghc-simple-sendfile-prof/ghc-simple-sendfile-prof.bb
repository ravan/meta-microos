SUMMARY = "Haskell simple-sendfile profiling library"
DESCRIPTION = "This package provides the Haskell simple-sendfile profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-prof-0.2.32-1.27.aarch64.rpm"
RPM_HASH = "3e9ce61f8fa13ec3e4e0b2e4d18cd200c7356d69e95b2b0285e13d63035814dc4740a964b9293d55ce914268cbb4a5de624aba9dd0ec7148720a5edc3132aff7"

RPROVIDES:${PN} += "ghc-prof-simple-sendfile-0.2.32-1TxnJXytdne4UoBrRdi39p \
ghc-simple-sendfile-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-unix-2.8.8.0-178a \
ghc-simple-sendfile-devel"

inherit rpm
