SUMMARY = "Pandas integration with sklearn"
DESCRIPTION = "This module provides a bridge between Scikit-Learn's machine learning \
methods and pandas-style Data Frames."
LICENSE = "BSD-2-Clause & Zlib"

PV = "2.2.0"

RPM_NAME = "python314-sklearn-pandas-2.2.0-4.5.noarch.rpm"
RPM_HASH = "0377f74860fc4c8492c7dd4256c8662cb4399d59c0a7ca874243679c7ec484cca42a3b1c4e75f1e8d99566511de74be970d6639a371a5b80f7ac653f4cc1e221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sklearn-pandas \
python314-sklearn-pandas \
python3dist-sklearn-pandas"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-pandas \
python314-scikit-learn \
python314-scipy"

inherit rpm
