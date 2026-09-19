SUMMARY = "Haskell wizards library development files"
DESCRIPTION = "This package provides the Haskell wizards library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-devel-1.0.3-7.16.aarch64.rpm"
RPM_HASH = "8aa7c907bbd309bdba459ce4bb3545ee292ef1b5037c1539f7614d1f789d510c263799c24cd2fc08b040c817f998fb068d595b37f00b39a294ad5d4f0cd6f2cb"

RPROVIDES:${PN} += "ghc-devel-wizards-1.0.3-4fQKmsLBMwT4qK3PkBwApR \
ghc-wizards-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-control-monad-free-0.6.2-INrHbxo4qSqC5LftAQgJHR \
ghc-devel-haskeline-0.8.4.1-767e \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-wizards"

inherit rpm
