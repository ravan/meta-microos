SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python310-czifile-2019.7.2-2.6.noarch.rpm"
RPM_HASH = "f3772aaba026bc72aa68988a011f1f851e06e3bd3978dc34672f3d8434be94c22929629cea271d1084f74509b6bc887237fda59690684f5cfae79d7188985f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-czifile \
python3.10dist-czifile \
python310-czifile \
python3dist-czifile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-imagecodecs \
python310-numpy \
python310-scipy \
python310-tifffile \
update-alternatives"

inherit rpm
