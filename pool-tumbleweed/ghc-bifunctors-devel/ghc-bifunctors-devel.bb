SUMMARY = "Haskell bifunctors library development files"
DESCRIPTION = "This package provides the Haskell bifunctors library development files."
LICENSE = "BSD-2-Clause"

PV = "5.6.3"

RPM_NAME = "ghc-bifunctors-devel-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "f058f6f43e3d90e6b4a3878ae46979f30e0e28a5175aaf717c4f21e9d6f4c5fcf44c80779238f7187f5dad433fc8bc94267382e06cc2d6d55bea205764df35f1"

RPROVIDES:${PN} += "ghc-bifunctors-devel \
ghc-devel-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bifunctors \
ghc-compiler \
ghc-devel-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7"

inherit rpm
