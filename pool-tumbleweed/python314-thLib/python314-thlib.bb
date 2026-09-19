SUMMARY = "Collection of Python utilities for signal analysis"
DESCRIPTION = "The thLib package contains functions for working with sound, and for \
fitting circles, lines, sine-waves, and exponential decays. For \
signal processing, a Savitzky-Golay filter is included, as well as a \
demonstration of the calculation of a power spectrum. UI utilities, \
and a few useful vector functions (e.g. an implementation of the\\ \
Savitzky-Golay algorithm) round off thLib. \
 \
Note: All functions for working with 3D kinematics have been moved into \
the new package 'scikit-kinematics'!"
LICENSE = "BSD-2-Clause"

PV = "0.12.2"

RPM_NAME = "python314-thLib-0.12.2-7.2.noarch.rpm"
RPM_HASH = "7bbf2710858529e10c76f87b2ed44934615302a5b29137b10f68829d68e9adeda2dd393a298a3e463cac8fecb6bf4687a0299606d2d9260c27844af9cd33e775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-thlib \
python314-thLib \
python3dist-thlib"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy \
python314-pandas \
python314-scikit-image \
python314-scipy \
python314-statsmodels \
python314-sympy"

inherit rpm
