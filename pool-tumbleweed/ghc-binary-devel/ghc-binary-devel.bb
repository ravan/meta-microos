SUMMARY = "Haskell binary library development files"
DESCRIPTION = "This package provides the Haskell binary library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.3"

RPM_NAME = "ghc-binary-devel-0.8.9.3-1.3.aarch64.rpm"
RPM_HASH = "d90c6bc48cd9987f4381bcdf9ebae604ad8c6d466b8ccf0edc156bb963b0676151937909f58af9994e20c98ca3877152fe0df478f3d89972f87bf3e635d2acac"

RPROVIDES:${PN} += "ghc-binary-devel \
ghc-binary-static \
ghc-devel-binary-0.8.9.3-9861"

RDEPENDS:${PN} += "ghc-binary \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1"

inherit rpm
