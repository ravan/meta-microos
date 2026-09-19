SUMMARY = "Haskell postgresql-libpq-configure library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-libpq-configure library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-postgresql-libpq-configure-doc-0.11-2.6.noarch.rpm"
RPM_HASH = "b164f621e7a4860c1febb3c34c30e019a74c25ccf374b0fac4a059f25fb67da5a7ad83d71afc2da17c396e1eaeab29c0f0c8693432ec84ac55918f429f1f072e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-libpq-configure-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
