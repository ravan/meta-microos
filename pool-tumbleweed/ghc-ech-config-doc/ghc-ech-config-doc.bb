SUMMARY = "Haskell ech-config library documentation"
DESCRIPTION = "This package provides the Haskell ech-config library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-ech-config-doc-0.0.1-2.2.noarch.rpm"
RPM_HASH = "8a8d8f787316c318fee791cddf920ebc2d80a7079e0b119d920eef97bcca2471dfe6670051dbf0234dfdc3c269bea40b27c27cbe0c8c48c63319ffcebdda7c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ech-config-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
