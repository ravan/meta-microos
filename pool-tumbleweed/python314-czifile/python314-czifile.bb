SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2026.6.12"

RPM_NAME = "python314-czifile-2026.6.12-1.2.noarch.rpm"
RPM_HASH = "792401432023c2a7ffc32c6d47774e413c154e8bdf27b634b29baf406381b218d03abcb3d865e5f8cf789510079f5e4fe5ab7082553413fbc50404c11ed5503c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-czifile \
python314-czifile \
python3dist-czifile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-imagecodecs \
python314-numpy \
python314-scipy \
python314-tifffile"

inherit rpm
