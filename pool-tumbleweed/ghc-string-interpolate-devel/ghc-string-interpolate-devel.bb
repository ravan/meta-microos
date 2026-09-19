SUMMARY = "Haskell string-interpolate library development files"
DESCRIPTION = "This package provides the Haskell string-interpolate library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4.0"

RPM_NAME = "ghc-string-interpolate-devel-0.3.4.0-5.2.aarch64.rpm"
RPM_HASH = "39198ed2fa01bb28711ff12dc56d47ccc5031ed0ee5e9f1bf773265edff4afb3c2a756de46b5d4a716a199f6f96714669b88f022a4eca8501e7d0cf560e96b3a"

RPROVIDES:${PN} += "ghc-devel-string-interpolate-0.3.4.0-33oQtZOJbICXcczDMt7VE \
ghc-string-interpolate-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-haskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j \
ghc-devel-haskell-src-meta-0.8.15-FnQqpPy0mwl8lKE5H2GQu6 \
ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-string-interpolate"

inherit rpm
