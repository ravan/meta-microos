SUMMARY = "Haskell happy-lib library development files"
DESCRIPTION = "This package provides the Haskell happy-lib library development files."
LICENSE = "BSD-2-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-happy-lib-devel-2.1.7-1.9.aarch64.rpm"
RPM_HASH = "612e42bd5c509127103f1388895d818f2e358aed92880ab3d7c5677306945426ff46e301aa0c782f9a9ee1b9c91539c553d695131bd29102ea65d7b4cefbe253"

RPROVIDES:${PN} += "ghc-devel-happy-lib-2.1.7-1bWmFhbsdZL4XZsKjWEDXF-grammar \
ghc-devel-happy-lib-2.1.7-49RqMizfc7QJTgGhqAkVnB \
ghc-devel-happy-lib-2.1.7-6xaKMZ2LurcJEr6RopPQyG-tabular \
ghc-devel-happy-lib-2.1.7-Dnzy2qXbK7YFIzoRs44leY-backend-glr \
ghc-devel-happy-lib-2.1.7-IRIqf5BOccQCIZdepGy2z4-backend-lalr \
ghc-devel-happy-lib-2.1.7-KSfVv5ihL2Q77EsIw4onBy-frontend \
ghc-happy-lib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-happy-lib"

inherit rpm
