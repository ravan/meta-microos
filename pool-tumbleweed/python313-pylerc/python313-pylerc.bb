SUMMARY = "Python Bindings for LERC: Limited Error Raster Compression"
DESCRIPTION = "LERC is an open-source image or raster format which supports rapid encoding \
and decoding for any pixel type (not just RGB or Byte). Users set the \
maximum compression error per pixel while encoding, so the precision of the \
original input image is preserved (within user defined error bounds). \
 \
This package provides the Python bindings for LERC."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "python313-pylerc-4.1-3.2.noarch.rpm"
RPM_HASH = "3eb6357f83f47576b3d2d8d739dd8e11631336cc0e17e91a73d1cb44f08aba05b3c538cdfa268de0f495aebaf7d802bc070e27a0b64a0d0f4f6a35b5d6fbe477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylerc \
python3.13dist-pylerc \
python313-pylerc \
python3dist-pylerc"

RDEPENDS:${PN} += "libLerc4 \
python-abi \
python313-numpy"

inherit rpm
