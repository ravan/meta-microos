SUMMARY = "Haskell typst-symbols library development files"
DESCRIPTION = "This package provides the Haskell typst-symbols library development files."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "ghc-typst-symbols-devel-0.2-1.2.aarch64.rpm"
RPM_HASH = "966856e21395391cd03a9ab0fbdae0a48f5aef6a64f38d5b552187a10f5fb36537875406047ca8d00822f53ebac8e57a47698edbb6d17a9fe8c047d6e079496a"

RPROVIDES:${PN} += "ghc-devel-typst-symbols-0.2-DAnODvBkUY47mTgQn4NVCA \
ghc-typst-symbols-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-text-2.1.4-cf23 \
ghc-typst-symbols"

inherit rpm
