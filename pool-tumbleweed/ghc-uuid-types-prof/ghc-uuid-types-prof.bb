SUMMARY = "Haskell uuid-types profiling library"
DESCRIPTION = "This package provides the Haskell uuid-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.6.1"

RPM_NAME = "ghc-uuid-types-prof-1.0.6.1-1.3.aarch64.rpm"
RPM_HASH = "17d6c813284f1bbb20809d0dcef2f1f5d68e44fd6536308fb0ab60bba4bfb3a7a713c565c3183d590c9908705cce712e364b000adf9f1b16bb015b333c98d8fa"

RPROVIDES:${PN} += "ghc-prof-uuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd \
ghc-uuid-types-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-uuid-types-devel"

inherit rpm
