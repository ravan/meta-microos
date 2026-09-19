SUMMARY = "Haskell pretty-simple profiling library"
DESCRIPTION = "This package provides the Haskell pretty-simple profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.1.4.0"

RPM_NAME = "ghc-pretty-simple-prof-4.1.4.0-1.9.aarch64.rpm"
RPM_HASH = "9d9d13db5ead44e7db8c549ab620f3b4f0348e8ba424645b073191ac7293725002bcc9b7d4c0eba046fd05e618856cb5730054ce18c2159ab09b71e3eac8e119"

RPROVIDES:${PN} += "ghc-pretty-simple-prof \
ghc-prof-pretty-simple-4.1.4.0-mOFDy31oJk3EKW6ny09ID"

RDEPENDS:${PN} += "ghc-pretty-simple-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-prettyprinter-1.7.2-I8Z9oIqYCiwIS8uRvukUd0 \
ghc-prof-prettyprinter-ansi-terminal-1.1.4-IMyc3qw4SO1C4KUUC4JLom \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
