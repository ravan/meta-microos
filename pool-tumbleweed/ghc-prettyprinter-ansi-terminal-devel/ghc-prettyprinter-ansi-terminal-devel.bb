SUMMARY = "Haskell prettyprinter-ansi-terminal library development files"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal library \
development files."
LICENSE = "BSD-2-Clause"

PV = "1.1.4"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-devel-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "6c9fcb52de6c77eaeef7b14499c39c96e4ea4628d480f35c02e7f6d87e9697045445aa59f02d252ff9dc975b19ae4f5fbb80b976422dee373d28f5e45c309593"

RPROVIDES:${PN} += "ghc-devel-prettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom \
ghc-prettyprinter-ansi-terminal-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-devel-text-2.1.4-cf23 \
ghc-prettyprinter-ansi-terminal"

inherit rpm
