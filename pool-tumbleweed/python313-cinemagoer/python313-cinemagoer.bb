SUMMARY = "Python package to access the IMDb's database"
DESCRIPTION = "cinemagoer is a Python package useful to retrieve and manage the data \
of the IMDb movie database about movies, people, characters and companies. \
 \
cinemagoer can retrieve data from both the IMDb's web server and a local \
copy of the whole database."
LICENSE = "GPL-2.0-or-later"

PV = "2026.6.27"

RPM_NAME = "python313-cinemagoer-2026.6.27-1.2.noarch.rpm"
RPM_HASH = "55ccf6a3e28f7c7dccd012e80789cbffe9c5bc3fe5af977540b5932de14a5a1963ea46a4b7e511897f1fb83bfa7660e0d2e7e26a4239169611bbe6d3c4a2ed17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-IMDbPY \
python3-cinemagoer \
python3.13dist-cinemagoer \
python313-IMDbPY \
python313-cinemagoer \
python3dist-cinemagoer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-SQLAlchemy \
python313-lxml \
update-alternatives"

inherit rpm
