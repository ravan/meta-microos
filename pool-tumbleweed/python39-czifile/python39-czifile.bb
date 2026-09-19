SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python39-czifile-2019.7.2-2.6.noarch.rpm"
RPM_HASH = "9529e40673c07fe2b6f327758a8a5ddb9e1d761106a24016fdfd20b166033859f722e074f5fd43c6204965f3bceb538d5b1852e4d15bdfbbb6e8a60c3f0ded7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-czifile \
python39-czifile \
python3dist-czifile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-imagecodecs \
python39-numpy \
python39-scipy \
python39-tifffile \
update-alternatives"

inherit rpm
