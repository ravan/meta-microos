SUMMARY = "Haskell prettyprinter profiling library"
DESCRIPTION = "This package provides the Haskell prettyprinter profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.7.2"

RPM_NAME = "ghc-prettyprinter-prof-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "3ec9a566a2e4225c8cdaf9b1254e9b64adb41ce3b9b3634b0c39d7abab86980d6d9ea3b55a2a539c8634d4e625ed568acc0f6bdcd862c32e68423939f69237e9"

RPROVIDES:${PN} += "ghc-prettyprinter-prof \
ghc-prof-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0"

RDEPENDS:${PN} += "ghc-prettyprinter-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
