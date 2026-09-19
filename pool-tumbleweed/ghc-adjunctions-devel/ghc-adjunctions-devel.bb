SUMMARY = "Haskell adjunctions library development files"
DESCRIPTION = "This package provides the Haskell adjunctions library development files."
LICENSE = "BSD-2-Clause"

PV = "4.4.4"

RPM_NAME = "ghc-adjunctions-devel-4.4.4-1.3.aarch64.rpm"
RPM_HASH = "e20f1775b88d69e5c8d9c57506b1f7a855ae035553a2be2fb28763463403f91a76836227b65fbfc026c7909aab80a7e63acffab2f2fcf1a0d668c4b22196380b"

RPROVIDES:${PN} += "ghc-adjunctions-devel \
ghc-devel-adjunctions-4.4.4-4nqsP3yaf6U1iY0vApuE6e"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-adjunctions \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-devel-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-devel-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
