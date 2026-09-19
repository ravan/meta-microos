SUMMARY = "Haskell css-text library development files"
DESCRIPTION = "This package provides the Haskell css-text library development files."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-devel-0.1.3.0-4.43.aarch64.rpm"
RPM_HASH = "45672c76ef649135d768ca54bbb13fd19c61979cb0f625458ffffa6310a277668cb6216ea630cfb05d06b961fed8f263c46e0cee76ac9a449d978a4661054895"

RPROVIDES:${PN} += "ghc-css-text-devel \
ghc-devel-css-text-0.1.3.0-H6znMdaU8xkJgIqMcqUC7W"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-css-text \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-text-2.1.4-cf23"

inherit rpm
