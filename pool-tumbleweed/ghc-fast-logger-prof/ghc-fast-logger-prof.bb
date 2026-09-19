SUMMARY = "Haskell fast-logger profiling library"
DESCRIPTION = "This package provides the Haskell fast-logger profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.2.6"

RPM_NAME = "ghc-fast-logger-prof-3.2.6-1.11.aarch64.rpm"
RPM_HASH = "456e3295386ba624e49dd96d7ebc16e7d9e640e930b40e2418e27e0ada6aa42218914a5e77c82d26abd25ebf4f73ba9c71196a5c9b30cb0882ba83df9ad53b02"

RPROVIDES:${PN} += "ghc-fast-logger-prof \
ghc-prof-fast-logger-3.2.6-JkXOEB4fbDV8mDlAr0wMkH"

RDEPENDS:${PN} += "ghc-fast-logger-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-auto-update-0.2.6-2tH9dVxiiOkBVROYgrOYPc \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-easy-file-0.2.5-HaH29sPzevuLIcTD4Zvwg0 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-unix-compat-0.7.4.1-4v781Gok1KY8Kg7jV1j1vn \
ghc-prof-unix-time-0.4.17-BauOeKKKj6kENMTfxOVI2q"

inherit rpm
