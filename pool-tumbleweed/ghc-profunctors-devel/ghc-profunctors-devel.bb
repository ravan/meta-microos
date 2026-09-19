SUMMARY = "Haskell profunctors library development files"
DESCRIPTION = "This package provides the Haskell profunctors library development files."
LICENSE = "BSD-3-Clause"

PV = "5.6.3"

RPM_NAME = "ghc-profunctors-devel-5.6.3-1.11.aarch64.rpm"
RPM_HASH = "f211c9b25d339743e5733ab9e41d1df714fc272e66cd5f8919374b22fb09b616496ec09aba397fbf3f2034e3195ee53b4f750343d30dfe2e5389762ee218541c"

RPROVIDES:${PN} += "ghc-devel-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-profunctors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-devel-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-devel-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-devel-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-profunctors"

inherit rpm
