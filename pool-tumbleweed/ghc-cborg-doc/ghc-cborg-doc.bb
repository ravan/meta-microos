SUMMARY = "Haskell cborg library documentation"
DESCRIPTION = "This package provides the Haskell cborg library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.10.0"

RPM_NAME = "ghc-cborg-doc-0.2.10.0-4.11.noarch.rpm"
RPM_HASH = "303fefd336fd3aca583c2dd2715113e1cce6f8d3bb855a0120d05db9ac6d6774415af962887132448c3ea10b85c04e68b83716e177a026d66053621ae16bdd2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cborg-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
