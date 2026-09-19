SUMMARY = "Haskell unix library development files"
DESCRIPTION = "This package provides the Haskell unix library development files."
LICENSE = "BSD-3-Clause"

PV = "2.8.8.0"

RPM_NAME = "ghc-unix-devel-2.8.8.0-1.3.aarch64.rpm"
RPM_HASH = "ba899fe580d87f817c34514f577b0ee467cb571fc833c0ac13321da3e36f1a2f39e37aa77144d305b7c49875841a66961eaf2a5e3e53c91e161d97b76eb06218"

RPROVIDES:${PN} += "ghc-devel-unix-2.8.8.0-178a \
ghc-unix-devel \
ghc-unix-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-time-1.14-a7dc \
ghc-unix"

inherit rpm
