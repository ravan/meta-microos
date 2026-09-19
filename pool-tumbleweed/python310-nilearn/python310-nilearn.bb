SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python310-nilearn-0.10.1-2.1.noarch.rpm"
RPM_HASH = "93a715336d185d05ec7cb102e90e1bd3af62e4604e6a1412cfd22e61d32bcb2b08b691b84bee66d1385ccf2e2f10d8b14bebc5b7ac9369f8803ee44d9d30a4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nilearn \
python310-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python310-joblib \
python310-matplotlib \
python310-nibabel \
python310-numpy \
python310-packaging \
python310-pandas \
python310-requests \
python310-scikit-learn \
python310-scipy"

inherit rpm
