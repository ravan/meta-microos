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

RPM_NAME = "python313-thLib-0.12.2-7.2.noarch.rpm"
RPM_HASH = "d147e5a78ac350a1623b0abfdd94f65293d9e128ab569227361fc37e211975e4fea6856802ea858d0c95f61362da7557e162f48d795f374bfba30bd5ca3b23d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-thLib \
python3.13dist-thlib \
python313-thLib \
python3dist-thlib"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy \
python313-pandas \
python313-scikit-image \
python313-scipy \
python313-statsmodels \
python313-sympy"

inherit rpm
