SUMMARY = "Haskell fsnotify profiling library"
DESCRIPTION = "This package provides the Haskell fsnotify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.0"

RPM_NAME = "ghc-fsnotify-prof-0.4.4.0-1.9.aarch64.rpm"
RPM_HASH = "5a532e41bf12331dfc9e33dfc60ebde00768700da2545c9c0b57bb6b37c371fbb5be80fe84444ce9c1cf30bb4418753c4900687c65e77fa7023fae9ab990b9c1"

RPROVIDES:${PN} += "ghc-fsnotify-prof \
ghc-prof-fsnotify-0.4.4.0-LuHPyjr4QGh136VBBqYNbJ"

RDEPENDS:${PN} += "ghc-fsnotify-devel \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-hinotify-0.4.2-4RRzWLCNgXK8AEnEbLT8bd \
ghc-prof-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-prof-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn"

inherit rpm
