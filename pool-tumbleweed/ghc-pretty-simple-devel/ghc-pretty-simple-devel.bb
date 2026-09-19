SUMMARY = "Haskell pretty-simple library development files"
DESCRIPTION = "This package provides the Haskell pretty-simple library development files."
LICENSE = "BSD-3-Clause"

PV = "4.1.4.0"

RPM_NAME = "ghc-pretty-simple-devel-4.1.4.0-1.9.aarch64.rpm"
RPM_HASH = "273e4f437dcb66f575ed1f273320650a9d811386a40d7c44434cb79a8d126a9fa8602213b855ceb53150430fcc3b36a41a0fe23a6fa43d7eacac1abdc6173159"

RPROVIDES:${PN} += "ghc-devel-pretty-simple-4.1.4.0-mOFDy31oJk3EKW6ny09ID \
ghc-pretty-simple-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-devel-prettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-pretty-simple"

inherit rpm
