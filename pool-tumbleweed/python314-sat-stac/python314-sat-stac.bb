SUMMARY = "A library for reading and working with Spatio-Temporal Asset Catalogs"
DESCRIPTION = "Sat-search is a Python 3 library and a command line tool for discovering \
and downloading publicly available satellite imagery using a conformant \
API such as sat-api."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python314-sat-stac-0.4.1-4.8.noarch.rpm"
RPM_HASH = "9072017b35311f3d626e8e5ef4ee896a8266e5683442980fc3f9d56ca8509febd59dbc7bb78ea5057dc540166f5510a3c72e2110142834d7cea8f91e17d4b6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sat-stac \
python314-sat-stac \
python3dist-sat-stac"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-python-dateutil \
python314-requests \
update-alternatives"

inherit rpm
