SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.6"

RPM_NAME = "python314-OSMPythonTools-0.3.6-1.4.noarch.rpm"
RPM_HASH = "99f4562b74f3e88e6ac94bea8e1cb4252ba0f0db4ed6ffa9b703004c72ef88540415f4f1ed644efaee20da94c25bfad4a39d00e2d59e319e93d1f265680347b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-osmpythontools \
python314-OSMPythonTools \
python3dist-osmpythontools"

RDEPENDS:${PN} += "python-abi \
python314-beautifulsoup4 \
python314-geojson \
python314-lxml \
python314-matplotlib \
python314-numpy \
python314-pandas \
python314-ujson \
python314-xarray"

inherit rpm
