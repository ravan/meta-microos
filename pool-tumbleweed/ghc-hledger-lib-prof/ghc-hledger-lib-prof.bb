SUMMARY = "Haskell hledger-lib profiling library"
DESCRIPTION = "This package provides the Haskell hledger-lib profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-lib-prof-1.52.1-1.4.aarch64.rpm"
RPM_HASH = "8fcc5f48aafbd2db2985d22067ac4f4a41cf5f81ee572a30e7a4b6a715b04b1097edc2e3b0d64bff984a00af188c97a3b53363969624c3867f63a137744c3672"

RPROVIDES:${PN} += "ghc-hledger-lib-prof \
ghc-prof-hledger-lib-1.52.1-4wPwI3AerCQ9IUzBwQug"

RDEPENDS:${PN} += "ghc-hledger-lib-devel \
ghc-prof-Decimal-0.5.2-1UdB985IcTF52sAwbBdCjx \
ghc-prof-Glob-0.10.2-AdAJXGIwHNdL3rTZGPrj2r \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-aeson-pretty-0.8.11-KCQLeDLfEIvAXp36rOTTo7 \
ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-prof-cassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR \
ghc-prof-cassava-megaparsec-2.1.1-92PMhFSA6UZBxfXRek9rSe \
ghc-prof-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg \
ghc-prof-colour-2.3.7-LuxtbazHK7IK55ldBice4c \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-prof-encoding-0.10.3-AvKSpiZHZdhEtvUKaxdqNC \
ghc-prof-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-hashtables-1.4.2-FXtFcQfURO18P8ZBa2ZYOT \
ghc-prof-lucid-2.11.20260427-J5tdl8KVr9TEYwm8nXmkS1 \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9 \
ghc-prof-pretty-simple-4.1.4.0-mOFDy31oJk3EKW6ny09ID \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-tabular-0.2.2.8-ICV0buHy8xI197ojnqVjgg \
ghc-prof-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-prof-tasty-hunit-0.10.2-7q5ZQxy9Ub5ZvPfhG0K4P \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-terminal-size-0.3.4-KpiFCzVajgTH7fY18MNMyf \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-prof-time-1.14-a7dc \
ghc-prof-timeit-2.0-3tAgGDzIoCu1cNsnFuFQeC \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-uglymemo-0.1.0.1-7xglRopOL0Q1bomJJkVUR \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
