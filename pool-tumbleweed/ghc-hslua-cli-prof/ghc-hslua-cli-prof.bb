SUMMARY = "Haskell hslua-cli profiling library"
DESCRIPTION = "This package provides the Haskell hslua-cli profiling library."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "ghc-hslua-cli-prof-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "ce9252283387c4bbe16b3c756ebd6a91deadfc0a7ad2b3b7436dd80ad8cfd699cf68608236a49df0dca6733be234eee8ae1c565bbdff0b0dfc04d4f1a86b2e72"

RPROVIDES:${PN} += "ghc-hslua-cli-prof \
ghc-prof-hslua-cli-1.4.4-BTUlZwIBQxmCvagI4bo8Rv"

RDEPENDS:${PN} += "ghc-hslua-cli-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-hslua-repl-0.1.2-KdgSeGpN6Tl9J954qfH0X5 \
ghc-prof-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
