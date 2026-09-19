SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-3-Clause"

PV = "2026.6.1"

RPM_NAME = "python314-tifffile-2026.6.1-1.2.noarch.rpm"
RPM_HASH = "c5bd0abb76488de34c77d1f649a48f0a8cca0b40805311f9a61470b34957bf4af32cbe10af73a935823307e5e93254ed95e707e0c22fca74e6ef1fb897fa9eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tifffile \
python314-tifffile \
python3dist-tifffile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-numpy \
update-alternatives"

inherit rpm
