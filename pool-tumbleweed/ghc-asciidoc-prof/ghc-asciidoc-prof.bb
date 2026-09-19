SUMMARY = "Haskell asciidoc profiling library"
DESCRIPTION = "This package provides the Haskell asciidoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.3"

RPM_NAME = "ghc-asciidoc-prof-0.1.0.3-1.3.aarch64.rpm"
RPM_HASH = "b629d98e12a80b595327e1be7084ef1d90642869f06d021858df52b0d2b06a460b4448ee0a03cb9b96b85e9f36f77dd503c1773ad6b29a4a46d2d18702e12f89"

RPROVIDES:${PN} += "ghc-asciidoc-prof \
ghc-prof-asciidoc-0.1.0.3-4LJxutGyvv2BedgmDvJWRc"

RDEPENDS:${PN} += "ghc-asciidoc-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-tagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv \
ghc-prof-text-2.1.4-cf23"

inherit rpm
