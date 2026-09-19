SUMMARY = "Haskell entropy library development files"
DESCRIPTION = "This package provides the Haskell entropy library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.11"

RPM_NAME = "ghc-entropy-devel-0.4.1.11-2.3.aarch64.rpm"
RPM_HASH = "3b0172a5bdd00f49e2bcb32b735e64c9343ef1e8b1368c50b2b3b8d19a02416837958ce991d15c52c7f0a193bc56724f19f03c1c39337b0fcd10bd788102077e"

RPROVIDES:${PN} += "ghc-devel-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-entropy-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-unix-2.8.8.0-178a \
ghc-entropy"

inherit rpm
