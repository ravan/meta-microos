SUMMARY = "Haskell xss-sanitize library development files"
DESCRIPTION = "This package provides the Haskell xss-sanitize library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-devel-0.3.7.2-2.36.aarch64.rpm"
RPM_HASH = "d3a6c67ce90589450b48d99a811b6bc3c90a9520bfd00bb54e49ffcc51ca635b832f179440736246a7ed4b4fe06c7fb334acdf481cab9f0521b64fca2c21bd86"

RPROVIDES:${PN} += "ghc-devel-xss-sanitize-0.3.7.2-zxNA19mSHN2TTh4wNg5nE \
ghc-xss-sanitize-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-css-text-0.1.3.0-H6znMdaU8xkJgIqMcqUC7W \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-tagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-xss-sanitize"

inherit rpm
