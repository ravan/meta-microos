SUMMARY = "Haskell base-orphans library documentation"
DESCRIPTION = "This package provides the Haskell base-orphans library documentation."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "ghc-base-orphans-doc-0.9.4-1.3.noarch.rpm"
RPM_HASH = "893451ca36320f5b12e22000330133eb637ad0a44855867d0bd42e35ca55ead1d73679350612d3f067c81a26969bc015e6068ee4866bf264538e3af242f2636b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-orphans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
