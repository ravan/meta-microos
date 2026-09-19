SUMMARY = "Haskell generically library development files"
DESCRIPTION = "This package provides the Haskell generically library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-devel-0.1.1-6.3.aarch64.rpm"
RPM_HASH = "044497cb236e3bef457de3d70b8d2f840f5cebaf1646718621c92ee97dc4e0e9e0b60546fcecc3c314e54d7cf4e47d46ec916305718f15e2b3cd432c814a8e3b"

RPROVIDES:${PN} += "ghc-devel-generically-0.1.1-KFVlHRUBXRKIFuvobfIRlH \
ghc-generically-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-generically"

inherit rpm
