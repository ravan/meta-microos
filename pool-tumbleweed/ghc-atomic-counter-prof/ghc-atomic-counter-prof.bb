SUMMARY = "Haskell atomic-counter profiling library"
DESCRIPTION = "This package provides the Haskell atomic-counter profiling library."
LICENSE = "Apache-2.0"

PV = "0.1.2.4"

RPM_NAME = "ghc-atomic-counter-prof-0.1.2.4-1.9.aarch64.rpm"
RPM_HASH = "f61958cf677b8ba9d829fb6f690c12fbbacc3b33946e42d6f9c9a9e7a00213f4a458f92d8d7cf1bd5d504c1a37b7b9352d8fc29a9a8fbbfcd5c526384ef76c71"

RPROVIDES:${PN} += "ghc-atomic-counter-prof \
ghc-prof-atomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6"

RDEPENDS:${PN} += "ghc-atomic-counter-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
