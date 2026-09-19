SUMMARY = "Haskell hjsmin library development files"
DESCRIPTION = "This package provides the Haskell hjsmin library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-devel-0.2.1-1.29.aarch64.rpm"
RPM_HASH = "e5915371d4bb660744fd374ca9a98ae9a2d0b1034b5eacf3a00ffe97006cf548f6955987bc3c9248e1901e94ffd31b13de0eee8826d02878f563806b9f47f593"

RPROVIDES:${PN} += "ghc-devel-hjsmin-0.2.1-8bKwnYn2QQi2TYSbwT5Kau \
ghc-hjsmin-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-language-javascript-0.7.1.0-KLLAIgUSnFo2SkJxZVCcjo \
ghc-devel-text-2.1.4-cf23 \
ghc-hjsmin"

inherit rpm
