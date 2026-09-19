SUMMARY = "Haskell asciidoc library development files"
DESCRIPTION = "This package provides the Haskell asciidoc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.3"

RPM_NAME = "ghc-asciidoc-devel-0.1.0.3-1.3.aarch64.rpm"
RPM_HASH = "073378b53a16fb494a2ac190a7e67c540d1ca3ebb588feea0dd2bd1ec324ed14b07a9bbd5ea0b9b69cb6a50dafc0994bf2542e4455d72403e88df782b1fe95d8"

RPROVIDES:${PN} += "ghc-asciidoc-devel \
ghc-devel-asciidoc-0.1.0.3-4LJxutGyvv2BedgmDvJWRc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asciidoc \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-tagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv \
ghc-devel-text-2.1.4-cf23"

inherit rpm
