SUMMARY = "Haskell optparse-applicative profiling library"
DESCRIPTION = "This package provides the Haskell optparse-applicative profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.19.0.0"

RPM_NAME = "ghc-optparse-applicative-prof-0.19.0.0-2.3.aarch64.rpm"
RPM_HASH = "e72a5ddc057fa1868dcbbad87dc021a7fc3d45d82880a14796097c169630eb2a1e9f6b3c198346b62911cc0bbb3fab51245655ebbf6a852d846ee1dae5d0f849"

RPROVIDES:${PN} += "ghc-optparse-applicative-prof \
ghc-prof-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq"

RDEPENDS:${PN} += "ghc-optparse-applicative-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-prof-prettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
