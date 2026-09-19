SUMMARY = "Haskell aeson-pretty library development files"
DESCRIPTION = "This package provides the Haskell aeson-pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.11"

RPM_NAME = "ghc-aeson-pretty-devel-0.8.11-1.3.aarch64.rpm"
RPM_HASH = "57cd3cef497e6d82c831f041da93171414c31aec485e7ac7dfa6d4fdb70c105d23ebafd085916eadcca8be06cf067fc7064b707cfadc4e28f660176c31136fda"

RPROVIDES:${PN} += "ghc-aeson-pretty-devel \
ghc-devel-aeson-pretty-0.8.11-KCQLeDLfEIvAXp36rOTTo7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aeson-pretty \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
