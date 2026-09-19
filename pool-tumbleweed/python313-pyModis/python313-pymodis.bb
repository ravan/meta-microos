SUMMARY = "Python library for MODIS data"
DESCRIPTION = "The Moderate Resolution Imaging Spectroradiometer (MODIS) is a \
payload imaging sensor built by Santa Barbara Remote Sensing that was \
launched into Earth orbit by NASA in 1999 on board the Terra (EOS AM) \
Satellite, and in 2002 on board the Aqua (EOS PM) satellite. \
pyModis is a Python library to download and process MODIS data from \
NASA servers."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.9"

RPM_NAME = "python313-pyModis-2.0.9-2.5.noarch.rpm"
RPM_HASH = "d0d9fd5e4de48df0748346eea28eb053b0ac916b8e2186293881dd2b339477eea5edb23472ee4070d56e3120cafb0f7ec504f9b186d89f55cc654db52c9bd77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyModis \
python3.13dist-pymodis \
python313-pyModis \
python3dist-pymodis"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
