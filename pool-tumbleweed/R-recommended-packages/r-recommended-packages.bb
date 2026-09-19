SUMMARY = "Metapackage, requires all recommended Packages"
DESCRIPTION = "Metapackage, Requires: all recommended Packages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-recommended-packages-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "94e5672f48f61314400ef4860366730901d6d0ce6e86d1753044cd484ab10f353699dfe9a2e17d5d11a5f204c7bc902b09f834ab4aa5bd6f3b4dc87e362e995c"

RPROVIDES:${PN} += "R-recommended-packages"

RDEPENDS:${PN} += "R-KernSmooth \
R-MASS \
R-Matrix \
R-base \
R-boot \
R-class \
R-cluster \
R-codetools \
R-foreign \
R-lattice \
R-mgcv \
R-nlme \
R-nnet \
R-rpart \
R-spatial \
R-survival"

inherit rpm
