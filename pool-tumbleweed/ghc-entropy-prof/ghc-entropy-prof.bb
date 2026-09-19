SUMMARY = "Haskell entropy profiling library"
DESCRIPTION = "This package provides the Haskell entropy profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.11"

RPM_NAME = "ghc-entropy-prof-0.4.1.11-2.3.aarch64.rpm"
RPM_HASH = "80aefaa6d22cb7850e49cb2f9a319646551b57192812bbf0a980933d30c6261a59e8fdccd63d6854ac7bf41574df0d984c4edddc08ebad9fe433e630a58076e2"

RPROVIDES:${PN} += "ghc-entropy-prof \
ghc-prof-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X"

RDEPENDS:${PN} += "ghc-entropy-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
