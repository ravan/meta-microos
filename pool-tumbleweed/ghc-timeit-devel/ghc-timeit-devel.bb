SUMMARY = "Haskell timeit library development files"
DESCRIPTION = "This package provides the Haskell timeit library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-devel-2.0-6.19.aarch64.rpm"
RPM_HASH = "14d042e2e7d6f1f6001120f5619b52d78e1bcccbc78de8d6d8c5e79d7b1c06e4910f217cc7e1f4d37335002b0181f7792af312d42d6a88ac4f7e7a72ab3f78f3"

RPROVIDES:${PN} += "ghc-devel-timeit-2.0-3tAgGDzIoCu1cNsnFuFQeC \
ghc-timeit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-timeit"

inherit rpm
