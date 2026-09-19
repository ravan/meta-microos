SUMMARY = "Haskell assoc profiling library"
DESCRIPTION = "This package provides the Haskell assoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "ghc-assoc-prof-1.1.1-3.3.aarch64.rpm"
RPM_HASH = "f0b65ddded838b32f95513b970b0b242c6449574d806ddb3b8b7fc8db4c943f30c42d4baa59c72fe58a98dcb4fa97188f96d17ae5c6b2c7cc1dedf989aec404f"

RPROVIDES:${PN} += "ghc-assoc-prof \
ghc-prof-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi"

RDEPENDS:${PN} += "ghc-assoc-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
