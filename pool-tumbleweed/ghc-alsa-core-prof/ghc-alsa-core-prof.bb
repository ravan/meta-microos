SUMMARY = "Haskell alsa-core profiling library"
DESCRIPTION = "This package provides the Haskell alsa-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-prof-0.5.0.1-4.20.aarch64.rpm"
RPM_HASH = "4153c8050d7508a609eca189f1d1aedb97f4f485880c074220b0a046ebffe01535b9617e9b5403a371582adc5e101db5822da41756da949825f5eeaa97461eed"

RPROVIDES:${PN} += "ghc-alsa-core-prof \
ghc-prof-alsa-core-0.5.0.1-5pqfH6YvvEZ2vsBkGGr8JL"

RDEPENDS:${PN} += "ghc-alsa-core-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-extensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU"

inherit rpm
