SUMMARY = "Pandas integration with sklearn"
DESCRIPTION = "This module provides a bridge between Scikit-Learn's machine learning \
methods and pandas-style Data Frames."
LICENSE = "BSD-2-Clause & Zlib"

PV = "2.2.0"

RPM_NAME = "python313-sklearn-pandas-2.2.0-4.5.noarch.rpm"
RPM_HASH = "783eaed3a1e03ec5031c0d9177a8d36e6594a42218ec5fe1ad632953def4016da90aa15c83355a1516323e3883450a026343f6c4c6198d1cef2ceb9e51449e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sklearn-pandas \
python3.13dist-sklearn-pandas \
python313-sklearn-pandas \
python3dist-sklearn-pandas"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-pandas \
python313-scikit-learn \
python313-scipy"

inherit rpm
