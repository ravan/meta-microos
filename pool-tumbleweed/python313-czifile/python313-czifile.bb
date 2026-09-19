SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2026.6.12"

RPM_NAME = "python313-czifile-2026.6.12-1.2.noarch.rpm"
RPM_HASH = "b378c6f78637470d1c14cf390bcf7edf508e9a7a3325e555394c45a8fa616e7ce5ac17ccf34c1961e4e5e0d3e1c749c86dff9e5626a9cce49ebc2547f5606fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-czifile \
python3.13dist-czifile \
python313-czifile \
python3dist-czifile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-imagecodecs \
python313-numpy \
python313-scipy \
python313-tifffile"

inherit rpm
