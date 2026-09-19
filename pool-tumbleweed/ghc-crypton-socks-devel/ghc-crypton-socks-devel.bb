SUMMARY = "Haskell crypton-socks library development files"
DESCRIPTION = "This package provides the Haskell crypton-socks library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "ghc-crypton-socks-devel-0.6.2-1.10.aarch64.rpm"
RPM_HASH = "40309d2d602b220c8daf34f1ce87c170112ed99510f9dbc99aa92e3909141dbb8c56f878af94acf08fb27e2aa08febbe72335eb671d70e4712a640607c7d8bc8"

RPROVIDES:${PN} += "ghc-crypton-socks-devel \
ghc-devel-crypton-socks-0.6.2-ArLwOvrWYIxHawSNyZavl9"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton-socks \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI"

inherit rpm
