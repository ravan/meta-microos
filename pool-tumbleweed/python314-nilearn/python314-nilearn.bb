SUMMARY = "Statistical learning tool for neuroimaging"
DESCRIPTION = "Nilearn is a Python module for statistical learning on \
NeuroImaging data."
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python314-nilearn-0.13.1-1.3.noarch.rpm"
RPM_HASH = "5af67adbd226ab8f745f0e6f9fa7a7fc62610c9c05a5f49ea0af668aff816f95f5962e502fdb5a170be62466fef54905e06e4b4ad0410c03b85efab61c8bc605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nilearn \
python314-nilearn \
python3dist-nilearn"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python314-jinja2 \
python314-joblib \
python314-nibabel \
python314-numpy \
python314-packaging \
python314-pandas \
python314-requests \
python314-scikit-learn \
python314-scipy"

inherit rpm
