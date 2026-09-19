SUMMARY = "Haskell raw-strings-qq library development files"
DESCRIPTION = "This package provides the Haskell raw-strings-qq library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-raw-strings-qq-devel-1.1-1.11.aarch64.rpm"
RPM_HASH = "4084b252abfa9cc41d23b02efada5e8f62fdadd095a46aec9637b9b46d045e510bb9dbb2d7d99d89f4c174333f3cc59506db6cc5af7990785a5eb684db310d96"

RPROVIDES:${PN} += "ghc-devel-raw-strings-qq-1.1-H6acAqxYi1VJgNUr5QPFMk \
ghc-raw-strings-qq-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-raw-strings-qq"

inherit rpm
