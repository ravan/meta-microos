SUMMARY = "Haskell xmonad library development files"
DESCRIPTION = "This package provides the Haskell xmonad library development files."
LICENSE = "BSD-3-Clause"

PV = "0.18.1"

RPM_NAME = "ghc-xmonad-devel-0.18.1-1.3.aarch64.rpm"
RPM_HASH = "2c3c045d7a941f1d91e3f4a2129a1a6b47d0f3df22a6a4bb162d01adeb54ecccd0b5d9cb84c3edf50c3bcd75c90faca8c072d3cfc7e6350cfacf96ca60d3ffcf"

RPROVIDES:${PN} += "ghc-devel-xmonad-0.18.1-92DX9BCe4RIB8NiPfjJWdp \
ghc-xmonad-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-setlocale-1.0.0.10-1AxYf6FKOpjAmPtKjx6N4K \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-xmonad"

inherit rpm
