SUMMARY = "Haskell unordered-containers profiling library"
DESCRIPTION = "This package provides the Haskell unordered-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.21"

RPM_NAME = "ghc-unordered-containers-prof-0.2.21-2.3.aarch64.rpm"
RPM_HASH = "cc80fbca0619ee68f49671c3f3dea0c7394e132b04b37631fce36dbf73a643aa791c54b8d623fa42e55d9ba197c5aeeb0e4b6927e0427a2d4bdd2bb6d5732b45"

RPROVIDES:${PN} += "ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-unordered-containers-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-unordered-containers-devel"

inherit rpm
