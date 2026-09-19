SUMMARY = "Structured Similarity Image Metric (SSIM)"
DESCRIPTION = "Module for computing Structured Similarity Image Metric (SSIM) in Python."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python313-pyssim-0.7.1-1.2.noarch.rpm"
RPM_HASH = "1486caeccf05230f06f146df55dc88584854aea547926e945af0fda1c20473274a6d972cb93e8dc7a57f445ad0ab9382d110ab74ee68d70f2b164b0e0ee99dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyssim \
python3.13dist-pyssim \
python313-pyssim \
python3dist-pyssim"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pillow \
python313-PyWavelets \
python313-numpy \
python313-scipy \
update-alternatives"

inherit rpm
