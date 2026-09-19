SUMMARY = "Haskell vector-stream profiling library"
DESCRIPTION = "This package provides the Haskell vector-stream profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-vector-stream-prof-0.1.0.1-5.9.aarch64.rpm"
RPM_HASH = "d0ce48e9bf8cb6c899b88f2064b4f8df86825fe3c8a2f239726e44e84badd34255fdb9ba1dffffbde7aebca959e6b0583cd35c6437ef8cd0ffc9f581a522166d"

RPROVIDES:${PN} += "ghc-prof-vector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF \
ghc-vector-stream-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-vector-stream-devel"

inherit rpm
