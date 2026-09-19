SUMMARY = "Haskell fsnotify library development files"
DESCRIPTION = "This package provides the Haskell fsnotify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.0"

RPM_NAME = "ghc-fsnotify-devel-0.4.4.0-1.9.aarch64.rpm"
RPM_HASH = "76729cc366f72b467859429d13117262091f15f55c360e6d57ea37b8a17d0a85158c04fa898d9e0fea9c9a520148b5be30d648eaeb94942db2d0a8f6b3aca8fa"

RPROVIDES:${PN} += "ghc-devel-fsnotify-0.4.4.0-LuHPyjr4QGh136VBBqYNbJ \
ghc-fsnotify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-hinotify-0.4.2-4RRzWLCNgXK8AEnEbLT8bd \
ghc-devel-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-devel-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-fsnotify"

inherit rpm
