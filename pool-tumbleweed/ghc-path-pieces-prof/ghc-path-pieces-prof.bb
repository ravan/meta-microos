SUMMARY = "Haskell path-pieces profiling library"
DESCRIPTION = "This package provides the Haskell path-pieces profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-prof-0.2.1-12.19.aarch64.rpm"
RPM_HASH = "f1a82e7c0b2dc11ae20def010ed1a4e210ef70c739072beeae8eb9e6055264d0ffab84298b73db03c65be3773c16c211f988b626c21ba99b98814a834748fd61"

RPROVIDES:${PN} += "ghc-path-pieces-prof \
ghc-prof-path-pieces-0.2.1-FtFHzM20JKUFHdFVBop6JH"

RDEPENDS:${PN} += "ghc-path-pieces-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc"

inherit rpm
