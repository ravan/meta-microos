SUMMARY = "Haskell lucid library development files"
DESCRIPTION = "This package provides the Haskell lucid library development files."
LICENSE = "BSD-3-Clause"

PV = "2.11.20260427"

RPM_NAME = "ghc-lucid-devel-2.11.20260427-1.3.aarch64.rpm"
RPM_HASH = "9e71c8a6dfb4feb873e2dacd0adc900b0b3ced7327093acdfbd7846f74a6c446ec02b118d1170d0c3309a233db51c3fdb6d27336096a2835b5ddb6414fc76d23"

RPROVIDES:${PN} += "ghc-devel-lucid-2.11.20260427-J5tdl8KVr9TEYwm8nXmkS1 \
ghc-lucid-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-mmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-lucid"

inherit rpm
