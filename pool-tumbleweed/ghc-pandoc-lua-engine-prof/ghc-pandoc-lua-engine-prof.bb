SUMMARY = "Haskell pandoc-lua-engine profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.3"

RPM_NAME = "ghc-pandoc-lua-engine-prof-0.5.3-1.5.aarch64.rpm"
RPM_HASH = "5aeb8b335a7920222e864857439369356e13315425f979a2ca2844378486498565ef22dd3c2a7ccfcf0a3c3b0b5b9844044927e435920d82c1ff6de9069473ef"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-prof \
ghc-prof-pandoc-lua-engine-0.5.3-5PRFHqRCebXKEUrEi9IFdG"

RDEPENDS:${PN} += "ghc-pandoc-lua-engine-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-citeproc-0.13.0.1-Ccf9E6t5yTGAMbIo1yftDS \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-prof-doctemplates-0.11.0.1-IzKaCnMe41UBaZntO1p87J \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-hslua-2.5.0-EJ5RjGxg4AI6GL8E9HKZKp \
ghc-prof-hslua-module-doclayout-1.2.1.1-Eyz3o1BKBTfIuJk50WY6Na \
ghc-prof-hslua-module-path-1.2.0-G27JYvFqudKJwS1Lw18QeC \
ghc-prof-hslua-module-system-1.3.0-JmXccm8tEh45eiVMZhLzZ2 \
ghc-prof-hslua-module-text-1.2.0-DwjhamFyoyqDccdYnCveaY \
ghc-prof-hslua-module-version-1.2.0.1-7Ta1Mn5URCJ9Pe3cHjwQh \
ghc-prof-hslua-module-zip-1.2.1-FF7qqe9nCmKFvC25WW3iJH \
ghc-prof-hslua-repl-0.1.2-KdgSeGpN6Tl9J954qfH0X5 \
ghc-prof-lpeg-1.1.0.1-Jbb90xEfizAEuGHvVCZgbp \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-pandoc-3.10-JLto7RkhLOI6KJZumkARl \
ghc-prof-pandoc-lua-marshal-0.3.2.1-6Zh3k4Z7NDRLHwqWkKsbjS \
ghc-prof-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
