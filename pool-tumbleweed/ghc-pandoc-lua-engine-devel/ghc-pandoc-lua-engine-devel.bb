SUMMARY = "Haskell pandoc-lua-engine library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.3"

RPM_NAME = "ghc-pandoc-lua-engine-devel-0.5.3-1.5.aarch64.rpm"
RPM_HASH = "9de891bd118c4402a95a003fb10650a71ae0aec7acc061413b6a463d8f740e251b1336e7c47ee0b7a47834de15eb8da19031c1b5210a40b65cca8bc20f5a3f95"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-engine-0.5.3-5PRFHqRCebXKEUrEi9IFdG \
ghc-pandoc-lua-engine-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-citeproc-0.13.0.1-Ccf9E6t5yTGAMbIo1yftDS \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-devel-doctemplates-0.11.0.1-IzKaCnMe41UBaZntO1p87J \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-hslua-2.5.0-EJ5RjGxg4AI6GL8E9HKZKp \
ghc-devel-hslua-module-doclayout-1.2.1.1-Eyz3o1BKBTfIuJk50WY6Na \
ghc-devel-hslua-module-path-1.2.0-G27JYvFqudKJwS1Lw18QeC \
ghc-devel-hslua-module-system-1.3.0-JmXccm8tEh45eiVMZhLzZ2 \
ghc-devel-hslua-module-text-1.2.0-DwjhamFyoyqDccdYnCveaY \
ghc-devel-hslua-module-version-1.2.0.1-7Ta1Mn5URCJ9Pe3cHjwQh \
ghc-devel-hslua-module-zip-1.2.1-FF7qqe9nCmKFvC25WW3iJH \
ghc-devel-hslua-repl-0.1.2-KdgSeGpN6Tl9J954qfH0X5 \
ghc-devel-lpeg-1.1.0.1-Jbb90xEfizAEuGHvVCZgbp \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-pandoc-3.10-JLto7RkhLOI6KJZumkARl \
ghc-devel-pandoc-lua-marshal-0.3.2.1-6Zh3k4Z7NDRLHwqWkKsbjS \
ghc-devel-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-text-2.1.4-cf23 \
ghc-pandoc-lua-engine"

inherit rpm
