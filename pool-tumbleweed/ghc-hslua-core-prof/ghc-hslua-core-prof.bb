SUMMARY = "Haskell hslua-core profiling library"
DESCRIPTION = "This package provides the Haskell hslua-core profiling library."
LICENSE = "MIT"

PV = "2.3.2.1"

RPM_NAME = "ghc-hslua-core-prof-2.3.2.1-1.3.aarch64.rpm"
RPM_HASH = "b266335ee8edd75bdbcc3230a19d45615c57cc1549839cc3da6001a1277ed963bcff8b9f946e7bcbc7821deee78bd67e9d580c01c5a134173d525fa410c3f400"

RPROVIDES:${PN} += "ghc-hslua-core-prof \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr"

RDEPENDS:${PN} += "ghc-hslua-core-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-text-2.1.4-cf23"

inherit rpm
