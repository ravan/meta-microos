SUMMARY = "Haskell xss-sanitize profiling library"
DESCRIPTION = "This package provides the Haskell xss-sanitize profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-prof-0.3.7.2-2.36.aarch64.rpm"
RPM_HASH = "91e89baa8e377d2dd7abdf152191b7ecd2e271b25ff984501b11f166638ab9ad5098f22bc2068220e768a89e8593eda74e721a6a911a92869b757fb3636aa1cb"

RPROVIDES:${PN} += "ghc-prof-xss-sanitize-0.3.7.2-zxNA19mSHN2TTh4wNg5nE \
ghc-xss-sanitize-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-css-text-0.1.3.0-H6znMdaU8xkJgIqMcqUC7W \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-tagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-xss-sanitize-devel"

inherit rpm
