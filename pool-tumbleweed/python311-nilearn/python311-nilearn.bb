SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "python311-nilearn-0.10.1-2.1.noarch.rpm"
RPM_HASH = "d65d99766cc943e1993eca7ef85244a72907fa0e8d0b6a23fe535016dbd237acb6b376e4f87315ca8a4b593f88814484733bd37f62ee9440d579cd8894abbdcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nilearn \
python3.11dist-nilearn \
python311-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
python-abi \
python311-joblib \
python311-matplotlib \
python311-nibabel \
python311-numpy \
python311-packaging \
python311-pandas \
python311-requests \
python311-scikit-learn \
python311-scipy"

inherit rpm
