SUMMARY = "Haskell modern-uri profiling library"
DESCRIPTION = "This package provides the Haskell modern-uri profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.6.1"

RPM_NAME = "ghc-modern-uri-prof-0.3.6.1-3.3.aarch64.rpm"
RPM_HASH = "a4058bf21fb7e6579c88077b7843f966cb83f9765cebfb34fc7f9cb6c2994d2167057f9f93c096e5eb7b087e75d3a2d36d858a60821027d54b42efbc35025bd9"

RPROVIDES:${PN} += "ghc-modern-uri-prof \
ghc-prof-modern-uri-0.3.6.1-FkSqiN91z46EG0W2PccBZ6"

RDEPENDS:${PN} += "ghc-modern-uri-devel \
ghc-prof-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-prof-reflection-2.1.9-D6RNqRhT9cGDEmA5fjQvJF \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23"

inherit rpm
