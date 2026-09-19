SUMMARY = "Haskell free library development files"
DESCRIPTION = "This package provides the Haskell free library development files."
LICENSE = "BSD-3-Clause"

PV = "5.2"

RPM_NAME = "ghc-free-devel-5.2-6.3.aarch64.rpm"
RPM_HASH = "60d04040e49594ee19e4ba35c1ca835522d65dcf3f2e35cccbff86f9422ec4d5241f257dd9d3b0db053c08b8eba6a80b6e0b78360d67212cbb2bcf28df514928"

RPROVIDES:${PN} += "ghc-devel-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-free-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-distributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-devel-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-free"

inherit rpm
