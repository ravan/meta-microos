SUMMARY = "Haskell hslua-typing profiling library"
DESCRIPTION = "This package provides the Haskell hslua-typing profiling library."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "ghc-hslua-typing-prof-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "482970f1e8fd663bd99a087f916999ce0011729b9dcfe6ad5db5801e731f9d9f60d31733038aaeb18069affd39748b7c98f5a1ea2def068dfe4f18229f111507"

RPROVIDES:${PN} += "ghc-hslua-typing-prof \
ghc-prof-hslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT"

RDEPENDS:${PN} += "ghc-hslua-typing-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o"

inherit rpm
