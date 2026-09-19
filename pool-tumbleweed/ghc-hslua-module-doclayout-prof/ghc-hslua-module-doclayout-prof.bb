SUMMARY = "Haskell hslua-module-doclayout profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout profiling library."
LICENSE = "MIT"

PV = "1.2.1.1"

RPM_NAME = "ghc-hslua-module-doclayout-prof-1.2.1.1-1.2.aarch64.rpm"
RPM_HASH = "6257b51824e8b440f2c32dac8d01bfe24c4757082a2c684f85f76d61c099c3018b9865cfdc2831479b5385ddff48ae3af0fd884c9684ce08abc2901846d21672"

RPROVIDES:${PN} += "ghc-hslua-module-doclayout-prof \
ghc-prof-hslua-module-doclayout-1.2.1.1-Eyz3o1BKBTfIuJk50WY6Na"

RDEPENDS:${PN} += "ghc-hslua-module-doclayout-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-prof-hslua-2.5.0-EJ5RjGxg4AI6GL8E9HKZKp \
ghc-prof-text-2.1.4-cf23"

inherit rpm
