SUMMARY = "Haskell prettyprinter-ansi-terminal profiling library"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.1.4"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-prof-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "9ddfa4a61315f4a2b6d547b68791b42ec7703bcecba06b280ad4a88e7634b2a93f77e0cb3f6fdcaf94bd4f94bc9e417030b5dc8684f781fc5d398fe8a376c44f"

RPROVIDES:${PN} += "ghc-prettyprinter-ansi-terminal-prof \
ghc-prof-prettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom"

RDEPENDS:${PN} += "ghc-prettyprinter-ansi-terminal-devel \
ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
