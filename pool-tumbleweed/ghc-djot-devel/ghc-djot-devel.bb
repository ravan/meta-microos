SUMMARY = "Haskell djot library development files"
DESCRIPTION = "This package provides the Haskell djot library development files."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ghc-djot-devel-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "9e5c55cea615b1b6d74c91fb56ce7a4733fe1724ca8200071efed5651efd560bbe0c77a3a0b9a24ef0ac0ebf17c3ff6e878b2a10d7c13d422a4d5726729c74ff"

RPROVIDES:${PN} += "ghc-devel-djot-0.1.4-544S34r37OfBfrOQhQH0gD \
ghc-djot-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-djot"

inherit rpm
