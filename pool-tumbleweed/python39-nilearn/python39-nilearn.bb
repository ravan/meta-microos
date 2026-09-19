SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python39-nilearn-0.10.1-2.1.noarch.rpm"
RPM_HASH = "5e00490efa9c21fc9b0f0b29141af7052a45cf0265f4de4a4b7aed0d4172c5de2d4a50c2e73102ce164c4e1dcd940b1047f6693940cf6425580dbb0d6d3491f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nilearn \
python39-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python39-joblib \
python39-matplotlib \
python39-nibabel \
python39-numpy \
python39-packaging \
python39-pandas \
python39-requests \
python39-scikit-learn \
python39-scipy"

inherit rpm
