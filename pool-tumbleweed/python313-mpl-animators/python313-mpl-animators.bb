SUMMARY = "An interative animation framework for matplotlib"
DESCRIPTION = "Aframework for creating interactive animations with matplotlib. \
It is designed to handle N-dimensional data, and can be used to create animations."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "python313-mpl-animators-1.2.4-2.5.noarch.rpm"
RPM_HASH = "0751d70906741189dcd0fcd0a1084f97149092468174edc18ec70e9b1283740d7932d24602d5a283033a73ba305cea4fa20d9cd19e24208cee0ccd0a1f1f3a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpl-animators \
python3.13dist-mpl-animators \
python313-mpl-animators \
python3dist-mpl-animators"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy"

inherit rpm
