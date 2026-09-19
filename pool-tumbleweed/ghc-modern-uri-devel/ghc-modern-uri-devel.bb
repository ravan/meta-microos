SUMMARY = "Haskell modern-uri library development files"
DESCRIPTION = "This package provides the Haskell modern-uri library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.6.1"

RPM_NAME = "ghc-modern-uri-devel-0.3.6.1-3.3.aarch64.rpm"
RPM_HASH = "1fa04db7ae670807ef759c3867294fd5af86bd8a04116a640824948bc2e3f976c6b065df39b1eefd58d41c5046eb8b6c368999f7601ae6fce724a2d568108a6a"

RPROVIDES:${PN} += "ghc-devel-modern-uri-0.3.6.1-FkSqiN91z46EG0W2PccBZ6 \
ghc-modern-uri-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-devel-reflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-modern-uri"

inherit rpm
