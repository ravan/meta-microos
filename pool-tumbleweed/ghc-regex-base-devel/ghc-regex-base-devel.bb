SUMMARY = "Haskell regex-base library development files"
DESCRIPTION = "This package provides the Haskell regex-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.3"

RPM_NAME = "ghc-regex-base-devel-0.94.0.3-1.12.aarch64.rpm"
RPM_HASH = "f62ea3dd51b6aecefb3fe78f908fe03dbeebaf8f1acb621264f3397d19044b838de02abdf9f3c0c4ea6bf35f810fa15b81444271a228f7b3880ff769a51105fe"

RPROVIDES:${PN} += "ghc-devel-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-regex-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-text-2.1.4-cf23 \
ghc-regex-base"

inherit rpm
