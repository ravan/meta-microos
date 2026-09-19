SUMMARY = "Haskell pandoc profiling library"
DESCRIPTION = "This package provides the Haskell pandoc profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "ghc-pandoc-prof-3.10-1.5.aarch64.rpm"
RPM_HASH = "7adc7d84414656fb13da6a88aa4fc6f3594067913339ed11ae48b47f32a886f037f490eca4f59999c3503371a29e39315ae4e0b6408a97c6a209a4d2386a9d85"

RPROVIDES:${PN} += "ghc-pandoc-prof \
ghc-prof-pandoc-3.10-3FNhTvSQPq5K7XNe2M6XFp-xml-light \
ghc-prof-pandoc-3.10-JLto7RkhLOI6KJZumkARl"

RDEPENDS:${PN} += "ghc-pandoc-devel \
ghc-prof-Glob-0.10.2-AdAJXGIwHNdL3rTZGPrj2r \
ghc-prof-JuicyPixels-3.3.9-IB5FNR8B0oDG4pRl7Jn2Mb \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-aeson-pretty-0.8.11-KCQLeDLfEIvAXp36rOTTo7 \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-asciidoc-0.1.0.3-4LJxutGyvv2BedgmDvJWRc \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-citeproc-0.13.0.1-Ccf9E6t5yTGAMbIo1yftDS \
ghc-prof-commonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51 \
ghc-prof-commonmark-extensions-0.2.7-1mQ1nSXKMfxCcwI2Hy1vjF \
ghc-prof-commonmark-pandoc-0.3-LD3VUAgig8i7h5XtC6wGuG \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y \
ghc-prof-crypton-x509-system-1.9.0-Kgk4Pc4QdTa954ljhsveQp \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-djot-0.1.4-544S34r37OfBfrOQhQH0gD \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-prof-doctemplates-0.11.0.1-IzKaCnMe41UBaZntO1p87J \
ghc-prof-emojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-gridtables-0.1.1.0-KsHUhKw0ygq7hJHkhQZNzX \
ghc-prof-haddock-library-1.11.0-799c \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-ipynb-0.2-FFISJjoqmq33DtDQybniaE \
ghc-prof-jira-wiki-markup-1.5.1-98GFxAn8YwIIHGuEhvyDFl \
ghc-prof-libyaml-0.1.4-E4bvPREJvp6KOHEKYnSP5s \
ghc-prof-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-pretty-show-1.10-9HKVlh92Ga177833HqSrwq \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-skylighting-0.14.7-K7tduWH6oDI3SHlt3x5zoz \
ghc-prof-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-prof-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-prof-tagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv \
ghc-prof-temporary-1.3-2Osk9MNG2oU9jER7tTbSTz \
ghc-prof-texmath-0.13.1.2-EtUAetkdjsPLSCg4vaSXlD \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t \
ghc-prof-time-1.14-a7dc \
ghc-prof-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-prof-typst-0.10-8KAGliP0h3p8xNVP0a5115 \
ghc-prof-unicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C \
ghc-prof-unicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj \
ghc-prof-unicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-xml-1.3.14-JuCOsTtMISWPxn2nU4HVl \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-prof-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw \
ghc-prof-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-prof-zip-archive-0.4.3.2-7LOPKgQ3Ei9AA5FjkJE7vc \
ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU"

inherit rpm
