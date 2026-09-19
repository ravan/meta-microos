SUMMARY = "Haskell gtk2hs-buildtools profiling library"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools profiling library."
LICENSE = "GPL-2.0-only"

PV = "0.13.12.0"

RPM_NAME = "ghc-gtk2hs-buildtools-prof-0.13.12.0-1.19.aarch64.rpm"
RPM_HASH = "9152d6fe12b8140072ce4b71db2132e769bf1ac35cd4ea9b01050cbb4f32e33e1976790cfc724196b057adb7580921a4a33a570bf00febf9a5e5c00f71f40699"

RPROVIDES:${PN} += "ghc-gtk2hs-buildtools-prof \
ghc-prof-gtk2hs-buildtools-0.13.12.0-AFsRqZlHhPaHAk4JlopdFw"

RDEPENDS:${PN} += "ghc-gtk2hs-buildtools-devel \
ghc-prof-Cabal-3.14.2.0-f8f4 \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-hashtables-1.4.2-FXtFcQfURO18P8ZBa2ZYOT \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh"

inherit rpm
