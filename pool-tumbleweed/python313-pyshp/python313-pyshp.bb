SUMMARY = "Python library for ESRI Shapefile format"
DESCRIPTION = "PySHP provides Python read/write support for the ESRI Shapefile \
geospatial vector data format."
LICENSE = "MIT"

PV = "3.1.6"

RPM_NAME = "python313-pyshp-3.1.6-1.1.noarch.rpm"
RPM_HASH = "36ad426ac01020090f7e98be2ee6bdc7cbf80ac3e4922c9282adb2c96052fe181b3eb997ff9027fb1334ba201ee070b107ca4b7cc1b14009f950164c8d0ee694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshp \
python3.13dist-pyshp \
python313-pyshp \
python3dist-pyshp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
