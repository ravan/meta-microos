SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-3-Clause"

PV = "2026.6.1"

RPM_NAME = "python313-tifffile-2026.6.1-1.2.noarch.rpm"
RPM_HASH = "38b024d5f33e2841e075afee3e190cb626b011c6162f8404127f7b7c910d59abd4d81a9b679f04685df8c87b72c807b1877b0ea51103bd4e7b094cf623b1d449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tifffile \
python3.13dist-tifffile \
python313-tifffile \
python3dist-tifffile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-numpy \
update-alternatives"

inherit rpm
