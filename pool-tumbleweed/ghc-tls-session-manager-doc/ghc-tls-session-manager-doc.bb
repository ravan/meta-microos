SUMMARY = "Haskell tls-session-manager library documentation"
DESCRIPTION = "This package provides the Haskell tls-session-manager library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-tls-session-manager-doc-0.1.0-1.2.noarch.rpm"
RPM_HASH = "c2ed338c0bd2dd9d3028165d80149d4981878b7016212f42530b204df1fd6d3d4a1c440e917caa19c8dd9b1af76414fd0b363e42014e682c7edfa738292c7158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-session-manager-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
