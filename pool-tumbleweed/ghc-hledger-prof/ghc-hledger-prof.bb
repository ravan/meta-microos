SUMMARY = "Haskell hledger profiling library"
DESCRIPTION = "This package provides the Haskell hledger profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-prof-1.52.1-1.5.aarch64.rpm"
RPM_HASH = "8cafb06ad725898e1e652211d212b4fd7dc590d6e8d129f6252c1d3b5f5b8b147802f4480478ee32d5b5550c4d3a4863af52c3925ba5985232bc08d5e13da749"

RPROVIDES:${PN} += "ghc-hledger-prof \
ghc-prof-hledger-1.52.1-7DZpaHQwuFEDioGQhnO8CW"

RDEPENDS:${PN} += "ghc-hledger-devel \
ghc-prof-Decimal-0.5.2-1UdB985IcTF52sAwbBdCjx \
ghc-prof-Diff-1.0.2-5PTxq8P0tjM13opDjMQ0ap \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-githash-0.1.7.0-CZogn6tBFSRH7zyPP5YHJu \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-haskeline-0.8.4.1-767e \
ghc-prof-hledger-lib-1.52.1-4wPwI3AerCQ9IUzBwQug \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-lucid-2.11.20260427-J5tdl8KVr9TEYwm8nXmkS1 \
ghc-prof-math-functions-0.3.4.4-q26fT9mxS1GCWlSGs7P32 \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-modern-uri-0.3.6.1-FkSqiN91z46EG0W2PccBZ6 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-prof-req-3.13.4-GNkdZfYi8gkLPTAscSZ3ct \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-prof-tabular-0.2.2.8-ICV0buHy8xI197ojnqVjgg \
ghc-prof-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-prof-temporary-1.3-2Osk9MNG2oU9jER7tTbSTz \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-ansi-0.3.0.1-VLtME1OTfL3OjlqJPcyHR \
ghc-prof-time-1.14-a7dc \
ghc-prof-timeit-2.0-3tAgGDzIoCu1cNsnFuFQeC \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-utility-ht-0.0.17.2-E9mYTmSklQHJf02bWgeDJF \
ghc-prof-wizards-1.0.3-4fQKmsLBMwT4qK3PkBwApR"

inherit rpm
