SUMMARY = "Haskell gtk2hs-buildtools library development files"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools library development files."
LICENSE = "GPL-2.0-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-gtk2hs-buildtools-devel-0.13.12.0-1.19.aarch64.rpm"
RPM_HASH = "1362e5bb74926218acc1b356e7d79f9e3d573263741335c90dff7e3f81747a05c92d6698d04e2eacbd90c157c2ebf3625b03b027d7b80b4ecffe34760b42c1b3"

RPROVIDES:${PN} += "ghc-devel-gtk2hs-buildtools-0.13.12.0-AFsRqZlHhPaHAk4JlopdFw \
ghc-gtk2hs-buildtools-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-3.14.2.0-f8f4 \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-hashtables-1.4.2-FXtFcQfURO18P8ZBa2ZYOT \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-gtk2hs-buildtools \
gtk2hs-buildtools"

inherit rpm
