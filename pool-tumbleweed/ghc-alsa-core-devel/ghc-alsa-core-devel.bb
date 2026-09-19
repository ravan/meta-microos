SUMMARY = "Haskell alsa-core library development files"
DESCRIPTION = "This package provides the Haskell alsa-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-devel-0.5.0.1-4.20.aarch64.rpm"
RPM_HASH = "3beb57731362944a857a993b9e5a21aff539f66ff83063d650ba766aa7e76c776ae4644e7abc82baba1992ff6fcc46055d8096207dcc8d5df739ed1299b5320f"

RPROVIDES:${PN} += "ghc-alsa-core-devel \
ghc-devel-alsa-core-0.5.0.1-5pqfH6YvvEZ2vsBkGGr8JL"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-alsa-core \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-extensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU \
pkgconfig \
pkgconfig-alsa"

inherit rpm
