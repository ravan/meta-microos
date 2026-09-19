SUMMARY = "Haskell string-interpolate profiling library"
DESCRIPTION = "This package provides the Haskell string-interpolate profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4.0"

RPM_NAME = "ghc-string-interpolate-prof-0.3.4.0-5.2.aarch64.rpm"
RPM_HASH = "a53a548af8aaf7d640b0ea9f0f24af093d20869a9ada30436ae006b8485fbe8ccd9129486cca2cdcc3601a21e74f188537e8764ce8f219104ff00a8f46e5737e"

RPROVIDES:${PN} += "ghc-prof-string-interpolate-0.3.4.0-33oQtZOJbICXcczDMt7VE \
ghc-string-interpolate-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-haskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j \
ghc-prof-haskell-src-meta-0.8.15-FnQqpPy0mwl8lKE5H2GQu6 \
ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-string-interpolate-devel"

inherit rpm
