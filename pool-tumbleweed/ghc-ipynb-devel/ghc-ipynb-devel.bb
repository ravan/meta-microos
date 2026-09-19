SUMMARY = "Haskell ipynb library development files"
DESCRIPTION = "This package provides the Haskell ipynb library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-devel-0.2-2.58.aarch64.rpm"
RPM_HASH = "1656ee6c856f9caddc976eabe68d6861d83a4f44dd520574e29737722c9f7499cc55c9419efc070c74198577f03c825da7acd28c5376d370b1491c9bded7a691"

RPROVIDES:${PN} += "ghc-devel-ipynb-0.2-FFISJjoqmq33DtDQybniaE \
ghc-ipynb-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-ipynb"

inherit rpm
