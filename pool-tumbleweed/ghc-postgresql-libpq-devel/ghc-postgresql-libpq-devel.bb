SUMMARY = "Haskell postgresql-libpq library development files"
DESCRIPTION = "This package provides the Haskell postgresql-libpq library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.0.0"

RPM_NAME = "ghc-postgresql-libpq-devel-0.11.0.0-3.3.aarch64.rpm"
RPM_HASH = "1d924d31450184dc259499ef2c0cb13e241a047d3f2ffed9996b15d72cef4a206f750942a836161cf470dfe2188d59eadb81a0460d5fa31e8de00a51d0e772d3"

RPROVIDES:${PN} += "ghc-devel-postgresql-libpq-0.11.0.0-H53T8dUwW2oIfn4i9jqgbB \
ghc-postgresql-libpq-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-postgresql-libpq-configure-0.11-EzI8IbT5wvJGrbHzfLVWH2 \
ghc-devel-unix-2.8.8.0-178a \
ghc-postgresql-libpq"

inherit rpm
