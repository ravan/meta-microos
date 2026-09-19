SUMMARY = "Haskell email-validate profiling library"
DESCRIPTION = "This package provides the Haskell email-validate profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.21"

RPM_NAME = "ghc-email-validate-prof-2.3.2.21-1.17.aarch64.rpm"
RPM_HASH = "639e0516f2b9eea82401691d8f37f62203a3b4424ef89bed235624702afcf566e425c568de930535af65148a9f30da09db430326d6cabf783aefc060c3aef180"

RPROVIDES:${PN} += "ghc-email-validate-prof \
ghc-prof-email-validate-2.3.2.21-Kzdyy7ay2BfLqW6NieUzU3"

RDEPENDS:${PN} += "ghc-email-validate-devel \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-template-haskell-2.23.0.0-358a"

inherit rpm
