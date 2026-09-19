SUMMARY = "Haskell hslogger profiling library"
DESCRIPTION = "This package provides the Haskell hslogger profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.0"

RPM_NAME = "ghc-hslogger-prof-1.3.2.0-1.9.aarch64.rpm"
RPM_HASH = "f7ea5fe804e686097dd9082d7919021a4a4bc43326da145b1ad7d7e13c2ef0469588f0f15675af342a70afa8d232976e0c73eda47d7407bcf9031ff52f02abc5"

RPROVIDES:${PN} += "ghc-hslogger-prof \
ghc-prof-hslogger-1.3.2.0-FAepwGeIaaOK1M8Dko3m8h"

RDEPENDS:${PN} += "ghc-hslogger-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx \
ghc-prof-time-1.14-a7dc \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
