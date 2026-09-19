SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python38-czifile-2019.7.2-2.6.noarch.rpm"
RPM_HASH = "ccd3a035f87332a5a08ae886a360e9f7ffbb4af3a5db3950e766dc1d708ff6c95682368a41259587c7e9a1c95b3638bc134d96da062cb32c833c2fa57eb2cdb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-czifile \
python38-czifile \
python3dist-czifile"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-imagecodecs \
python38-numpy \
python38-scipy \
python38-tifffile \
update-alternatives"

inherit rpm
