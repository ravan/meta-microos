SUMMARY = "An Enterprise Resource Planning (ERP) system"
DESCRIPTION = "This package contains the server of the Tryton application platform, \
the latter of which is a three-tier high-level general purpose \
application platform written in Python, using Postgresql as the \
database engine. Tryton provides modularity, scalability and \
security."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.55"

RPM_NAME = "trytond-7.0.55-1.1.noarch.rpm"
RPM_HASH = "9102154609b1e4e64144a38371bbd1b5b55ab42e22a3e17cb89b09432644035b0ceb8957c7ae4655886e5c38bcf072aa02d2f8f05c18e476dcf8bdc36e87aae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-trytond \
group-tryton \
python3.13dist-trytond \
python3dist-trytond \
trytond \
user-tryton"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
graphviz \
html2text \
libreoffice-pyuno \
python-abi \
python3-Genshi \
python3-Levenshtein \
python3-Pillow \
python3-Werkzeug \
python3-bcrypt \
python3-dateutil \
python3-defusedxml \
python3-gevent \
python3-lxml \
python3-passlib \
python3-polib \
python3-psycopg2 \
python3-pydot \
python3-python-sql \
python3-relatorio \
python3-weasyprint \
python3-webcolors \
python3-wrapt \
unoconv"

inherit rpm
