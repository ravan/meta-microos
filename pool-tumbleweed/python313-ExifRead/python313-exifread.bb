SUMMARY = "Module to read Exif metadata from TIFF and JPEG files"
DESCRIPTION = "A Python module to extract Exif metadata from TIFF and JPEG files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "python313-ExifRead-3.0.0-3.5.noarch.rpm"
RPM_HASH = "0f3bf34209811ebfa96bdaf35139eba188acf4edbca0ffbbf5f715bedb2d0dc0f76c08669f636561dc1e05cc355fafe63a7e2f18dbaeb79cd556ec5540b40fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ExifRead \
python3.13dist-exifread \
python313-ExifRead \
python3dist-exifread"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
