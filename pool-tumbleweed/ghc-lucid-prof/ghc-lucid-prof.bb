SUMMARY = "Haskell lucid profiling library"
DESCRIPTION = "This package provides the Haskell lucid profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.11.20260427"

RPM_NAME = "ghc-lucid-prof-2.11.20260427-1.3.aarch64.rpm"
RPM_HASH = "85b1c8ed3ab924816f8d9a5cf4fe56fd1a2463723f73b651164daff870b9eb818fb6fd9c859dc6eba85e282f2e15aff06f641be6d66c8323a690e73d9013b5bc"

RPROVIDES:${PN} += "ghc-lucid-prof \
ghc-prof-lucid-2.11.20260427-J5tdl8KVr9TEYwm8nXmkS1"

RDEPENDS:${PN} += "ghc-lucid-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-mmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
