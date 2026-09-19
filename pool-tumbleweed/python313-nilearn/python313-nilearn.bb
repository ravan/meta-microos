SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python313-nilearn-0.13.1-1.3.noarch.rpm"
RPM_HASH = "8b9c8669b9fa00ff544e4bdfadb60ed73276ab93f63d1ac416013e1601e38bbd43f0b71c59f500b6d9e821e945ba50ed9886365283b71db67026af589f9d2481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nilearn \
python3.13dist-nilearn \
python313-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python313-jinja2 \
python313-joblib \
python313-nibabel \
python313-numpy \
python313-packaging \
python313-pandas \
python313-requests \
python313-scikit-learn \
python313-scipy"

inherit rpm
