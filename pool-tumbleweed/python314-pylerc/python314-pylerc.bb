SUMMARY = "Python Bindings for LERC: Limited Error Raster Compression"
DESCRIPTION = "LERC is an open-source image or raster format which supports rapid encoding \
and decoding for any pixel type (not just RGB or Byte). Users set the \
maximum compression error per pixel while encoding, so the precision of the \
original input image is preserved (within user defined error bounds). \
 \
This package provides the Python bindings for LERC."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "python314-pylerc-4.1-3.2.noarch.rpm"
RPM_HASH = "c587840935ea9ef28a853ce88c7b5550c196dc20b35db4fb754d746a12e67319b7578e0402714d595f64a6e8ebb47acf7fbbdb6e7fd0af4c5dfdf353ee6e079d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylerc \
python314-pylerc \
python3dist-pylerc"

RDEPENDS:${PN} += "libLerc4 \
python-abi \
python314-numpy"

inherit rpm
