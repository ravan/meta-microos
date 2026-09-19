SUMMARY = "Haskell prettyprinter library development files"
DESCRIPTION = "This package provides the Haskell prettyprinter library development files."
LICENSE = "BSD-2-Clause"

PV = "1.7.2"

RPM_NAME = "ghc-prettyprinter-devel-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "676cc9ff35386a00f17178e1453db6425922b2b3a165cd3f224bd8e686c032579bca3387de2793e84067c2be51f34903f6deef2d297fe4424725afd5a0553270"

RPROVIDES:${PN} += "ghc-devel-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-prettyprinter-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-text-2.1.4-cf23 \
ghc-prettyprinter"

inherit rpm
