SUMMARY = "Haskell free profiling library"
DESCRIPTION = "This package provides the Haskell free profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.2"

RPM_NAME = "ghc-free-prof-5.2-6.3.aarch64.rpm"
RPM_HASH = "4be3565a95e86927a9148b61451306e4bbf58dc590fd8e325412449a9f71791d8fb8a20c340fb29f68bb497a3a124ec679e25566a68c03f0241346bd26b42e9e"

RPROVIDES:${PN} += "ghc-free-prof \
ghc-prof-free-5.2-4eWU5ydqIMF46nGJ3OnruR"

RDEPENDS:${PN} += "ghc-free-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-prof-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB"

inherit rpm
