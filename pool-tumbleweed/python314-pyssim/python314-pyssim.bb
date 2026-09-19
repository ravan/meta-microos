SUMMARY = "Structured Similarity Image Metric (SSIM)"
DESCRIPTION = "Module for computing Structured Similarity Image Metric (SSIM) in Python."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python314-pyssim-0.7.1-1.2.noarch.rpm"
RPM_HASH = "8ebd6fc3bc6e58e56c370786601e0b7af1e47b64099208d88f45720e8508b18cc7ca4e2ee5fccd4f8ed42eadeabe7efb390621cf09f88e4e591a41e4d0589dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyssim \
python314-pyssim \
python3dist-pyssim"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pillow \
python314-PyWavelets \
python314-numpy \
python314-scipy \
update-alternatives"

inherit rpm
