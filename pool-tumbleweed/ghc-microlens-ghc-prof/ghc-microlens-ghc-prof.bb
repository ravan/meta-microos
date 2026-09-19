SUMMARY = "Haskell microlens-ghc profiling library"
DESCRIPTION = "This package provides the Haskell microlens-ghc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.15.2"

RPM_NAME = "ghc-microlens-ghc-prof-0.4.15.2-1.9.aarch64.rpm"
RPM_HASH = "5de5319b3889f0d681c4c4697444d0fe64a42c1819904655e37e6e656208b947288a3c7664753529cbef8921aaa54f694ee675173fc69e996ccccdb824fbf71e"

RPROVIDES:${PN} += "ghc-microlens-ghc-prof \
ghc-prof-microlens-ghc-0.4.15.2-Cj0815upqHk4qg3lDbGmdr"

RDEPENDS:${PN} += "ghc-microlens-ghc-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
