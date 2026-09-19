SUMMARY = "Haskell postgresql-libpq library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-libpq library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.0.0"

RPM_NAME = "ghc-postgresql-libpq-doc-0.11.0.0-3.3.noarch.rpm"
RPM_HASH = "64665de43d129ec7b5bd6258c00cf8a611b52ee22beb159314d81e6de516b46f51d1922a2895f42bc15ef10028b2b9906c9382a6b28d82e1f3d7d7341b609b0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-libpq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
