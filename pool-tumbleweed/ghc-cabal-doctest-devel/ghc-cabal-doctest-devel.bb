SUMMARY = "Haskell cabal-doctest library development files"
DESCRIPTION = "This package provides the Haskell cabal-doctest library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.12"

RPM_NAME = "ghc-cabal-doctest-devel-1.0.12-2.3.aarch64.rpm"
RPM_HASH = "88dd37c10a882f897d4ce1e3ff99785ccb63cec0b6c2a7e6fc03da37ac4e3f9b6e135816c0d34a35b3de0941f8bde493fa4d0ed15e8a22953c44f6e360e07843"

RPROVIDES:${PN} += "ghc-cabal-doctest-devel \
ghc-devel-cabal-doctest-1.0.12-9BatbH3Akyg7qG3sD8QDn0"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-doctest \
ghc-compiler \
ghc-devel-Cabal-3.14.2.0-f8f4 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b"

inherit rpm
