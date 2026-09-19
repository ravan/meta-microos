SUMMARY = "Python library for MODIS data"
DESCRIPTION = "The Moderate Resolution Imaging Spectroradiometer (MODIS) is a \
payload imaging sensor built by Santa Barbara Remote Sensing that was \
launched into Earth orbit by NASA in 1999 on board the Terra (EOS AM) \
Satellite, and in 2002 on board the Aqua (EOS PM) satellite. \
pyModis is a Python library to download and process MODIS data from \
NASA servers."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.9"

RPM_NAME = "python314-pyModis-2.0.9-2.5.noarch.rpm"
RPM_HASH = "41bab3ca19fe43a28c8ff55399cfc8517dd8d1cc17acbd43aeb236bca19bcd775d74a97af02f4ca3f4b0946c649b24a649cefde2416ec8674b19f2d8780f3d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymodis \
python314-pyModis \
python3dist-pymodis"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
