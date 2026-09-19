SUMMARY = "Haskell adjunctions profiling library"
DESCRIPTION = "This package provides the Haskell adjunctions profiling library."
LICENSE = "BSD-2-Clause"

PV = "4.4.4"

RPM_NAME = "ghc-adjunctions-prof-4.4.4-1.3.aarch64.rpm"
RPM_HASH = "66ce9b3a3bac89db3abe92c5acc9800bb26078c570fd8aebc01c737e793bb13cfbefce8d5f7084e26e8aa7f50f58b393461ba8d05b2dfc40eb6275762ccee468"

RPROVIDES:${PN} += "ghc-adjunctions-prof \
ghc-prof-adjunctions-4.4.4-4nqsP3yaf6U1iY0vApuE6e"

RDEPENDS:${PN} += "ghc-adjunctions-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-prof-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-prof-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
