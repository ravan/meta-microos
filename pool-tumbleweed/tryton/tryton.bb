SUMMARY = "The client of the Tryton application platform"
DESCRIPTION = "The client of the Tryton application platform. \
A three-tiers  high-level general purpose application platform \
written in Python and use Postgresql as database engine. \
It is the core base of an Open Source ERP. \
It provides modularity, scalability and security."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.42"

RPM_NAME = "tryton-7.0.42-1.1.noarch.rpm"
RPM_HASH = "afe8beefc88e93f605e24e17f5cb1631550f17cb82a4cb85b531a18fd5bdd609e156176e73a738e26c848a2ea20b2dea44ca6900462dede09bf244f14663ecc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-tryton \
python3dist-tryton \
tryton"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-GooCalendar \
python3-cairo \
python3-chardet \
python3-dateutil \
python3-gnupg \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pytz \
python3-setuptools \
python3-simplejson \
python3-xml"

inherit rpm
