SUMMARY = "Haskell hpke library development files"
DESCRIPTION = "This package provides the Haskell hpke library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-hpke-devel-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "06dbcc6ee07958b374ee4132a0c629088c5bb5d73beee7179de63ae7d12a29d1f771e999c1cf1f5df1607f56299c50ee67407ecde9ae6b5aef8ff10e5d00556e"

RPROVIDES:${PN} += "ghc-devel-hpke-0.1.0-FWQ67GYIQQ2GKLielMsG9n \
ghc-hpke-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-hpke"

inherit rpm
