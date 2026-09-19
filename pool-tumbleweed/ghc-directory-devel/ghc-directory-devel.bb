SUMMARY = "Haskell directory library development files"
DESCRIPTION = "This package provides the Haskell directory library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.10.1"

RPM_NAME = "ghc-directory-devel-1.3.10.1-1.3.aarch64.rpm"
RPM_HASH = "10f4b7bf3052a592d8dc817b29d2c80ee281e14e5c70610522f69dd6c2692dccf04f57811f6f737e50ff84f6ccd54d0c5546fbe041e3e0fd1b39901857fed06c"

RPROVIDES:${PN} += "ghc-devel-directory-1.3.10.1-b1d7 \
ghc-directory-devel \
ghc-directory-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-file-io-0.1.6-8374 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-time-1.14-a7dc \
ghc-devel-unix-2.8.8.0-178a \
ghc-directory"

inherit rpm
