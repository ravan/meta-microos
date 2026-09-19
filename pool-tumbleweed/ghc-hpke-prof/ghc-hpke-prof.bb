SUMMARY = "Haskell hpke profiling library"
DESCRIPTION = "This package provides the Haskell hpke profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-hpke-prof-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "ca9987d2f5ded261589c7c5de2f26da6b4188f44d9e93e2ff914e32e537edbc8d653deca8d5dde3b6851aacf47d3f99f0c50cbbf5a8201fc80e41b476b9b00a6"

RPROVIDES:${PN} += "ghc-hpke-prof \
ghc-prof-hpke-0.1.0-FWQ67GYIQQ2GKLielMsG9n"

RDEPENDS:${PN} += "ghc-hpke-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr"

inherit rpm
