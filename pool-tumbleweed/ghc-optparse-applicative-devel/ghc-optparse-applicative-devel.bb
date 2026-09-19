SUMMARY = "Haskell optparse-applicative library development files"
DESCRIPTION = "This package provides the Haskell optparse-applicative library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.19.0.0"

RPM_NAME = "ghc-optparse-applicative-devel-0.19.0.0-2.3.aarch64.rpm"
RPM_HASH = "b34866d2767c83b3e9a752034772b92e5575efbbf1100c662e4ecd860db6a43b2a36780b6a36f8bcc73c8193802c4f08abc5b39e98161153029c4d17bbd3f763"

RPROVIDES:${PN} += "ghc-devel-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-optparse-applicative-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-devel-prettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-optparse-applicative"

inherit rpm
