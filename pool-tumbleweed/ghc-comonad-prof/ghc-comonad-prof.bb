SUMMARY = "Haskell comonad profiling library"
DESCRIPTION = "This package provides the Haskell comonad profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.0.10"

RPM_NAME = "ghc-comonad-prof-5.0.10-1.3.aarch64.rpm"
RPM_HASH = "d42a3584e64769a4bddf1b4532a94b53748512e5892e00fad73b98b0cc69e0590fce1dcb1dc938ca3a4de01727744b14ffbdf262f91a5d92ddbbf450a61e4733"

RPROVIDES:${PN} += "ghc-comonad-prof \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP"

RDEPENDS:${PN} += "ghc-comonad-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
