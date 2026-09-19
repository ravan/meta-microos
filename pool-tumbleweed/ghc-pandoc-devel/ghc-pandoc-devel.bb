SUMMARY = "Haskell pandoc library development files"
DESCRIPTION = "This package provides the Haskell pandoc library development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "ghc-pandoc-devel-3.10-1.5.aarch64.rpm"
RPM_HASH = "dda3d520ba8fd566f61f09522cb896634ad1a09e8d060ddf7acdb718c975977abcc16402ea8e3faa43211842272495f162f46b2e6eb09bb756922098568fa939"

RPROVIDES:${PN} += "ghc-devel-pandoc-3.10-3FNhTvSQPq5K7XNe2M6XFp-xml-light \
ghc-devel-pandoc-3.10-JLto7RkhLOI6KJZumkARl \
ghc-pandoc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Glob-0.10.2-AdAJXGIwHNdL3rTZGPrj2r \
ghc-devel-JuicyPixels-3.3.9-IB5FNR8B0oDG4pRl7Jn2Mb \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-aeson-pretty-0.8.11-KCQLeDLfEIvAXp36rOTTo7 \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-asciidoc-0.1.0.3-4LJxutGyvv2BedgmDvJWRc \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-citeproc-0.13.0.1-Ccf9E6t5yTGAMbIo1yftDS \
ghc-devel-commonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51 \
ghc-devel-commonmark-extensions-0.2.7-1mQ1nSXKMfxCcwI2Hy1vjF \
ghc-devel-commonmark-pandoc-0.3-LD3VUAgig8i7h5XtC6wGuG \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-crypton-connection-0.4.6-EpYbEhgynWEHAydR26M0y \
ghc-devel-crypton-x509-system-1.9.0-Kgk4Pc4QdTa954ljhsveQp \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-djot-0.1.4-544S34r37OfBfrOQhQH0gD \
ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-devel-doctemplates-0.11.0.1-IzKaCnMe41UBaZntO1p87J \
ghc-devel-emojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-gridtables-0.1.1.0-KsHUhKw0ygq7hJHkhQZNzX \
ghc-devel-haddock-library-1.11.0-799c \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-ipynb-0.2-FFISJjoqmq33DtDQybniaE \
ghc-devel-jira-wiki-markup-1.5.1-98GFxAn8YwIIHGuEhvyDFl \
ghc-devel-libyaml-0.1.4-E4bvPREJvp6KOHEKYnSP5s \
ghc-devel-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-pretty-show-1.10-9HKVlh92Ga177833HqSrwq \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-skylighting-0.14.7-K7tduWH6oDI3SHlt3x5zoz \
ghc-devel-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-devel-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-devel-tagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv \
ghc-devel-temporary-1.3-2Osk9MNG2oU9jER7tTbSTz \
ghc-devel-texmath-0.13.1.2-EtUAetkdjsPLSCg4vaSXlD \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t \
ghc-devel-time-1.14-a7dc \
ghc-devel-tls-2.4.3-9EoJ6T6XUplFSFHrhcQuuh \
ghc-devel-typst-0.10-8KAGliP0h3p8xNVP0a5115 \
ghc-devel-unicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C \
ghc-devel-unicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj \
ghc-devel-unicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-xml-1.3.14-JuCOsTtMISWPxn2nU4HVl \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-devel-xml-types-0.3.8-35OA2z37X8M4UCRyGooeYw \
ghc-devel-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-devel-zip-archive-0.4.3.2-7LOPKgQ3Ei9AA5FjkJE7vc \
ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-pandoc"

inherit rpm
