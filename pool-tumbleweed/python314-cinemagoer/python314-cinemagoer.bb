SUMMARY = "Python package to access the IMDb's database"
DESCRIPTION = "cinemagoer is a Python package useful to retrieve and manage the data \
of the IMDb movie database about movies, people, characters and companies. \
 \
cinemagoer can retrieve data from both the IMDb's web server and a local \
copy of the whole database."
LICENSE = "GPL-2.0-or-later"

PV = "2026.6.27"

RPM_NAME = "python314-cinemagoer-2026.6.27-1.2.noarch.rpm"
RPM_HASH = "ed4d7066910b590009412d7d16d75bb0965a459cfb94e378ee437b5a0f5d8a0d39f8a1e55ad55ff88bfb17fd8fa2aa915e73500dbb899f0019bf3574b97ff4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cinemagoer \
python314-IMDbPY \
python314-cinemagoer \
python3dist-cinemagoer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-SQLAlchemy \
python314-lxml \
update-alternatives"

inherit rpm
