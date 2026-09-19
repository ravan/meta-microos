SUMMARY = "Haskell skylighting library documentation"
DESCRIPTION = "This package provides the Haskell skylighting library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.7"

RPM_NAME = "ghc-skylighting-doc-0.14.7-1.13.noarch.rpm"
RPM_HASH = "91afe9cfe63011b4dc612c8b688f4d53a22403103530952fae005beeb5bcbf05d7f4b0aa2abd9ce80860a83b940adf018c7002796ef1fefb67a9359189a51e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
