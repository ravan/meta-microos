SUMMARY = "Haskell hledger library development files"
DESCRIPTION = "This package provides the Haskell hledger library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-devel-1.52.1-1.5.aarch64.rpm"
RPM_HASH = "1d1c32a98e992f34b42587265d6779a0320779c939ac72178f5b5cd986edfb4d7a0278259d73324cf4e423324eabca51a536868209bb5b9e1a3df07de17b9537"

RPROVIDES:${PN} += "ghc-devel-hledger-1.52.1-7DZpaHQwuFEDioGQhnO8CW \
ghc-hledger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Decimal-0.5.2-1UdB985IcTF52sAwbBdCjx \
ghc-devel-Diff-1.0.2-5PTxq8P0tjM13opDjMQ0ap \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cmdargs-0.10.22-HkrnpmTZ18VE75B7wmB8rg \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-githash-0.1.7.0-CZogn6tBFSRH7zyPP5YHJu \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-haskeline-0.8.4.1-767e \
ghc-devel-hledger-lib-1.52.1-4wPwI3AerCQ9IUzBwQug \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-lucid-2.11.20260427-J5tdl8KVr9TEYwm8nXmkS1 \
ghc-devel-math-functions-0.3.4.4-q26fT9mxS1GCWlSGs7P32 \
ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-modern-uri-0.3.6.1-FkSqiN91z46EG0W2PccBZ6 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-devel-req-3.13.4-GNkdZfYi8gkLPTAscSZ3ct \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-devel-tabular-0.2.2.8-ICV0buHy8xI197ojnqVjgg \
ghc-devel-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-devel-temporary-1.3-2Osk9MNG2oU9jER7tTbSTz \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-ansi-0.3.0.1-VLtME1OTfL3OjlqJPcyHR \
ghc-devel-time-1.14-a7dc \
ghc-devel-timeit-2.0-3tAgGDzIoCu1cNsnFuFQeC \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-utility-ht-0.0.17.2-E9mYTmSklQHJf02bWgeDJF \
ghc-devel-wizards-1.0.3-4fQKmsLBMwT4qK3PkBwApR \
ghc-hledger"

inherit rpm
