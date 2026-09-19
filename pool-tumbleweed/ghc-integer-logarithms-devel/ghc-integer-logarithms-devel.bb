SUMMARY = "Haskell integer-logarithms library development files"
DESCRIPTION = "This package provides the Haskell integer-logarithms library development \
files."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "ghc-integer-logarithms-devel-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "5f6f1b7ae1e9b08d93fecc9661d8d9b343ccf92ca7e4db91edf6adfac3759733087d04cc8ebd6e315288b3fda28637bd8f1dbfc747c1ee1d8deb4ce2bfa551c5"

RPROVIDES:${PN} += "ghc-devel-integer-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2 \
ghc-integer-logarithms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-integer-logarithms"

inherit rpm
