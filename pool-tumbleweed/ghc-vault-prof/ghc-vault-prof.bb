SUMMARY = "Haskell vault profiling library"
DESCRIPTION = "This package provides the Haskell vault profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.2.0"

RPM_NAME = "ghc-vault-prof-0.3.2.0-1.2.aarch64.rpm"
RPM_HASH = "224e5729471580d6c829b6b6378f66d1b84a3a8b6fb9dc17ccab5e631dea3820ce8f4c6eb10e6f3c631e5312c9289efee5dd47b74648cc9f71b71e81e44fe33e"

RPROVIDES:${PN} += "ghc-prof-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-vault-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-vault-devel"

inherit rpm
