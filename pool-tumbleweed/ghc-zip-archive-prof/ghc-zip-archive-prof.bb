SUMMARY = "Haskell zip-archive profiling library"
DESCRIPTION = "This package provides the Haskell zip-archive profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.2"

RPM_NAME = "ghc-zip-archive-prof-0.4.3.2-2.17.aarch64.rpm"
RPM_HASH = "4212ee91abb313fb1fd98a3824986113c3849974617f5bdaa426500956aa268168ba922293282800bc329d403d22043267e9d1e4ea3e546cd75627cfe85c82ad"

RPROVIDES:${PN} += "ghc-prof-zip-archive-0.4.3.2-7LOPKgQ3Ei9AA5FjkJE7vc \
ghc-zip-archive-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-digest-0.0.2.1-KdJahDzYM113RUTsWm7UXN \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-zip-archive-devel"

inherit rpm
