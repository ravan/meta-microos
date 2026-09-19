SUMMARY = "Module to read Exif metadata from TIFF and JPEG files"
DESCRIPTION = "A Python module to extract Exif metadata from TIFF and JPEG files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python314-ExifRead-3.0.0-3.5.noarch.rpm"
RPM_HASH = "8e296f5622d2bd07c691e6401d2a2ec031f192d053edff57626d0756e42e509746b48bae041cd8d25f38e7b30a2b507cf49d67a620d197b4e340dd3ecc2f14ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-exifread \
python314-ExifRead \
python3dist-exifread"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
