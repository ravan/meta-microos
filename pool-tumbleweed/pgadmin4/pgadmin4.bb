SUMMARY = "Management tool for PostgreSQL"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. It is written as a web application in Python, \
using jQuery and Bootstrap for the client side processing and UI. On \
the server side, Flask is being utilised. \
 \
This package contains the required files to run pgAdmin4 as a web application"
LICENSE = "PostgreSQL"

PV = "9.17"

RPM_NAME = "pgadmin4-9.17-1.1.noarch.rpm"
RPM_HASH = "3ed54954c428203ea65049890d62dde8925aee75bed3f53bd6fedf69aed72b2dcf0371f4a50d33dc425359302727095fa6372e847281cf4932d9435fb244221c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pgadmin4 \
pgadmin4 \
python3.13dist-pgadmin4 \
python3dist-pgadmin4"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
group-pgadmin \
python-abi \
python313-Authlib \
python313-Flask \
python313-Flask-Babel \
python313-Flask-Compress \
python313-Flask-Login \
python313-Flask-Mail \
python313-Flask-Migrate \
python313-Flask-Paranoid \
python313-Flask-SQLAlchemy \
python313-Flask-Security \
python313-Flask-SocketIO \
python313-Flask-WTF \
python313-SQLAlchemy \
python313-WTForms \
python313-Werkzeug \
python313-bcrypt \
python313-certifi \
python313-cryptography \
python313-eventlet \
python313-gssapi \
python313-jsonformatter \
python313-keyring \
python313-ldap3 \
python313-libgravatar \
python313-libpass \
python313-paramiko \
python313-psutil \
python313-psycopg \
python313-pyotp \
python313-python-dateutil \
python313-pytz \
python313-qrcode \
python313-setuptools \
python313-sqlparse \
python313-sshtunnel \
python313-typer \
python313-urllib3 \
python313-user-agents \
system-user-pgadmin \
systemd \
user-pgadmin"

inherit rpm
