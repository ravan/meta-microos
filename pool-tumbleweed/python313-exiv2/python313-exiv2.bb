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

RPM_NAME = "python313-exiv2-0.19.2-1.1.aarch64.rpm"
RPM_HASH = "f40ec0932045db6b61dbc63119a9eedbc94bc3fbb0310685563cce1dddd822417d60f5a4d6e1b38ec933dc4faff4531a7d6496a9332c6b3c7db1ad1132d59cb6"

RPROVIDES:${PN} += "python3-exiv2 \
python3.13dist-exiv2 \
python313-exiv2 \
python3dist-exiv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
