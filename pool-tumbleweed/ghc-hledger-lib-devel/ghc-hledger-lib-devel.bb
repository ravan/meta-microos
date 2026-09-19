SUMMARY = "Haskell hledger-lib library development files"
DESCRIPTION = "This package provides the Haskell hledger-lib library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-lib-devel-1.52.1-1.4.aarch64.rpm"
RPM_HASH = "2aec4e0eca75786fb3765f96f947d8b34ba4737abd10d38527b8f01edc47687afcc501b5ab8cd7633c8c34a694e68fbfa3e14cf9469c947d80f53e585db00ed9"

RPROVIDES:${PN} += "ghc-devel-hledger-lib-1.52.1-4wPwI3AerCQ9IUzBwQug \
ghc-hledger-lib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Decimal-0.5.2-1UdB985IcTF52sAwbBdCjx \
ghc-devel-Glob-0.10.2-AdAJXGIwHNdL3rTZGPrj2r \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-aeson-pretty-0.8.11-KCQLeDLfEIvAXp36rOTTo7 \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-devel-cassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR \
ghc-devel-cassava-megaparsec-2.1.1-92PMhFSA6UZBxfXRek9rSe \
ghc-devel-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg \
ghc-devel-colour-2.3.7-LuxtbazHK7IK55ldBice4c \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-devel-encoding-0.10.3-AvKSpiZHZdhEtvUKaxdqNC \
ghc-devel-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-hashtables-1.4.2-FXtFcQfURO18P8ZBa2ZYOT \
ghc-devel-lucid-2.11.20260427-J5tdl8KVr9TEYwm8nXmkS1 \
ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9 \
ghc-devel-pretty-simple-4.1.4.0-mOFDy31oJk3EKW6ny09ID \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-tabular-0.2.2.8-ICV0buHy8xI197ojnqVjgg \
ghc-devel-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-devel-tasty-hunit-0.10.2-7q5ZQxy9Ub5ZvPfhG0K4P \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-terminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-devel-time-1.14-a7dc \
ghc-devel-timeit-2.0-3tAgGDzIoCu1cNsnFuFQeC \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-uglymemo-0.1.0.1-7xglRopOL0Q1bomJJkVUR \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-hledger-lib"

inherit rpm
