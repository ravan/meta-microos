SUMMARY = "Haskell csv profiling library"
DESCRIPTION = "This package provides the Haskell csv profiling library."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-prof-0.1.2-4.19.aarch64.rpm"
RPM_HASH = "ae28428d603b51a6981fae31e8e41d4cb33c9a66c4e6dbe314f92d1d125bd47bb46a440738b838bb4155809c4115dd9ae9a88a3fde79593261de693de25e49dd"

RPROVIDES:${PN} += "ghc-csv-prof \
ghc-prof-csv-0.1.2-3wV9bBF7sWG7h8WLMiwYq8"

RDEPENDS:${PN} += "ghc-csv-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-parsec-3.1.18.0-be05"

inherit rpm
