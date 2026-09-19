SUMMARY = "Haskell time library development files"
DESCRIPTION = "This package provides the Haskell time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.14"

RPM_NAME = "ghc-time-devel-1.14-1.3.aarch64.rpm"
RPM_HASH = "0af4deb985fc3892a04a4b1c92602a326c7d9e6368f43e35054d6782a5968a51934643ebd678084ec97e001e91456fbe8d811728f566655acc856ad059e1e018"

RPROVIDES:${PN} += "ghc-devel-time-1.14-a7dc \
ghc-time-devel \
ghc-time-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-time"

inherit rpm
