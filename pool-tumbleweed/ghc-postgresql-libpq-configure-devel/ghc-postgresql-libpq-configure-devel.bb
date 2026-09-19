SUMMARY = "Haskell postgresql-libpq-configure library development files"
DESCRIPTION = "This package provides the Haskell postgresql-libpq-configure library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-postgresql-libpq-configure-devel-0.11-2.6.aarch64.rpm"
RPM_HASH = "ab06dca2111ed85eda05c2870af93229b60b0d64a80b3c071bf2de61036af4d40f6e0b5bc8d5eafdf0ef04aa560c86a10e7c67dc83ca85bb72f6852e1d9275e7"

RPROVIDES:${PN} += "ghc-devel-postgresql-libpq-configure-0.11-EzI8IbT5wvJGrbHzfLVWH2 \
ghc-postgresql-libpq-configure-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-postgresql-libpq-configure"

inherit rpm
