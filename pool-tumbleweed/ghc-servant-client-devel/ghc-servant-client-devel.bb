SUMMARY = "Haskell servant-client library development files"
DESCRIPTION = "This package provides the Haskell servant-client library development files."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-client-devel-0.20.3.0-3.17.aarch64.rpm"
RPM_HASH = "d2a0d141b618d52716972a29c9a824744fbd9efabad06536e97621bffe0d389fe71e5e03054afc1a7dd1d8c898075dea2c36e51655f8adf4fb9be969716d13fe"

RPROVIDES:${PN} += "ghc-devel-servant-client-0.20.3.0-DnhFqVViMhFKThELlg5Ol5 \
ghc-servant-client-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-kan-extensions-5.2.8-BhPXqlF7GPZ4azZSK3TJ3I \
ghc-devel-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-devel-servant-0.20.3.0-AuNk1SYjBzoHus6V4PFhXb \
ghc-devel-servant-client-core-0.20.3.0-DaPX1t71UYQ3aIUvJX1TuT \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-servant-client"

inherit rpm
