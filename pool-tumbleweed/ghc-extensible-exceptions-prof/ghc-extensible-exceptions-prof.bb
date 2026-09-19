SUMMARY = "Haskell extensible-exceptions profiling library"
DESCRIPTION = "This package provides the Haskell extensible-exceptions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-prof-0.1.1.4-7.23.aarch64.rpm"
RPM_HASH = "3c965e28bc0d40f30adcf0801636be0f905abcbd261d82b13774a0b02a9cb600b876869c893745478842ad57c767c072ca366866e245485a4fb855450ef49bc5"

RPROVIDES:${PN} += "ghc-extensible-exceptions-prof \
ghc-prof-extensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU"

RDEPENDS:${PN} += "ghc-extensible-exceptions-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
