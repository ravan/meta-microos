SUMMARY = "Haskell servant-client profiling library"
DESCRIPTION = "This package provides the Haskell servant-client profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-client-prof-0.20.3.0-3.17.aarch64.rpm"
RPM_HASH = "b19015a1dc93382bf1b2394ae7fed3932cb8ae4bd4b1fde012aa857279006682a90ea87d2fc88dc5e535deff463f0142e32fa66c97b6beb5d2698b34e78ce6a8"

RPROVIDES:${PN} += "ghc-prof-servant-client-0.20.3.0-DnhFqVViMhFKThELlg5Ol5 \
ghc-servant-client-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-kan-extensions-5.2.8-BhPXqlF7GPZ4azZSK3TJ3I \
ghc-prof-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-semigroupoids-6.0.2-B6Y5GIvJ2JI8mXJpMQTJaF \
ghc-prof-servant-0.20.3.0-AuNk1SYjBzoHus6V4PFhXb \
ghc-prof-servant-client-core-0.20.3.0-DaPX1t71UYQ3aIUvJX1TuT \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-servant-client-devel"

inherit rpm
