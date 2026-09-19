SUMMARY = "Python3 bindings for the exiv2 library"
DESCRIPTION = "python3-exiv2 is a Python 3 binding to exiv2, the C++ library for manipulation \
of EXIF, IPTC and XMP image metadata. It is a python 3 module that allows your \
scripts to read and write metadata (EXIF, IPTC, XMP, thumbnails) embedded in \
image files (JPEG, TIFF, ...). \
 \
It is designed as a high-level interface to the functionalities offered by \
libexiv2. Using python’s built-in data types and standard modules, it provides \
easy manipulation of image metadata."
LICENSE = "GPL-3.0-only"

PV = "0.19.2"

RPM_NAME = "python314-exiv2-0.19.2-1.1.aarch64.rpm"
RPM_HASH = "9172bd575ec5eb5b8927f2ddcdbac4289b157790187e4c84edf0b6fbc466aeeec92a720105efbf5b41e3d261161a242521f7f08778dd4d7cea12bfba97fcad3a"

RPROVIDES:${PN} += "python3.14dist-exiv2 \
python314-exiv2 \
python3dist-exiv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
