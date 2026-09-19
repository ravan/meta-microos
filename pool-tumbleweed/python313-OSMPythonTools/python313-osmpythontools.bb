SUMMARY = "A library to access OpenStreetMap related services"
DESCRIPTION = "A library to access OpenStreetMap related services"
LICENSE = "GPL-3.0-only"

PV = "0.3.6"

RPM_NAME = "python313-OSMPythonTools-0.3.6-1.4.noarch.rpm"
RPM_HASH = "74d1f5be6f0481dfe8bbb150a67b605d9e59cfd815130eaf6741a18627fbc18ab65d1e39670b5af830d4d194fc79c29ef318d9f22273bc7242cc195b917c2c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-OSMPythonTools \
python3.13dist-osmpythontools \
python313-OSMPythonTools \
python3dist-osmpythontools"

RDEPENDS:${PN} += "python-abi \
python313-beautifulsoup4 \
python313-geojson \
python313-lxml \
python313-matplotlib \
python313-numpy \
python313-pandas \
python313-ujson \
python313-xarray"

inherit rpm
