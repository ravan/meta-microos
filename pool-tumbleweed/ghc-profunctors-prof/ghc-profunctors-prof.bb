SUMMARY = "Haskell profunctors profiling library"
DESCRIPTION = "This package provides the Haskell profunctors profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.6.3"

RPM_NAME = "ghc-profunctors-prof-5.6.3-1.11.aarch64.rpm"
RPM_HASH = "e79d031e44a1716f2a0b52f49b1a8efc439ee478b524b1bfb8568bf1107ca6edc1adc6e50bad11a3f392d778c0493f62988ecb89906500b1d7150fd72347ce8c"

RPROVIDES:${PN} += "ghc-prof-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-profunctors-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-prof-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-prof-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-prof-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-profunctors-devel"

inherit rpm
