SUMMARY = "Haskell xmonad profiling library"
DESCRIPTION = "This package provides the Haskell xmonad profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.18.1"

RPM_NAME = "ghc-xmonad-prof-0.18.1-1.3.aarch64.rpm"
RPM_HASH = "fb898cc4170e498865061832a33e43635082fb6f91d0fc9655f8586ba062fdcabd7ab1840e55bfb2881023cc953187df10ffce6956c790476d3917be273b6cf7"

RPROVIDES:${PN} += "ghc-prof-xmonad-0.18.1-92DX9BCe4RIB8NiPfjJWdp \
ghc-xmonad-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-setlocale-1.0.0.10-1AxYf6FKOpjAmPtKjx6N4K \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-xmonad-devel"

inherit rpm
