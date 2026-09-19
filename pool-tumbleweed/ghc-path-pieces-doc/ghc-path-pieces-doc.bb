SUMMARY = "Haskell path-pieces library documentation"
DESCRIPTION = "This package provides the Haskell path-pieces library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-doc-0.2.1-12.19.noarch.rpm"
RPM_HASH = "d227c7898d290529bfb7f5de096e85fb775a3c422d6fb038db61b511cd66e9bbe73c960a1c3a39696964e68143f6fdc3c36e829230d92535ea42701eb66a56bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-path-pieces-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
