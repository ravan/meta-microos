SUMMARY = "Haskell raw-strings-qq profiling library"
DESCRIPTION = "This package provides the Haskell raw-strings-qq profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-raw-strings-qq-prof-1.1-1.11.aarch64.rpm"
RPM_HASH = "39e13f8778a693be1d9e2f8f4bea8d6d8a623390781e893c54ae39f95eac566d58a8ac4c36655a68429870300cac3ad7337b9d3ebf6494cd1dcd9947d38c2829"

RPROVIDES:${PN} += "ghc-prof-raw-strings-qq-1.1-H6acAqxYi1VJgNUr5QPFMk \
ghc-raw-strings-qq-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-raw-strings-qq-devel"

inherit rpm
