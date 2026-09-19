SUMMARY = "Haskell easy-file library development files"
DESCRIPTION = "This package provides the Haskell easy-file library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-devel-0.2.5-1.32.aarch64.rpm"
RPM_HASH = "891d421e1b786dd04fa615f351e05c1f1e5c928941923c52bb120ac7da899aaf2cb599c95263b8c9be853dc2a45d9c98d6c0565fdaa528fd98c0d8e7479efbcf"

RPROVIDES:${PN} += "ghc-devel-easy-file-0.2.5-HaH29sPzevuLIcTD4Zvwg0 \
ghc-easy-file-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-time-1.14-a7dc \
ghc-devel-unix-2.8.8.0-178a \
ghc-easy-file"

inherit rpm
