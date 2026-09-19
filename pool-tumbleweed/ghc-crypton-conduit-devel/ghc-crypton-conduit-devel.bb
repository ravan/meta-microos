SUMMARY = "Haskell crypton-conduit library development files"
DESCRIPTION = "This package provides the Haskell crypton-conduit library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-crypton-conduit-devel-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "2c7ea8b98dc17c20c034afee0a228161640292bf3f8039ed2b67fda43c2fd8611b97071dbc003505e9ad23b13f438378a66a4f1df82c7d40299d3659c95c904a"

RPROVIDES:${PN} += "ghc-crypton-conduit-devel \
ghc-devel-crypton-conduit-0.3.0-ID9cpdbxIMIJwDEvCNr6mu"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-conduit \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
