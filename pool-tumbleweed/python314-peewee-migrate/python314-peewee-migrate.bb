SUMMARY = "Support for migrations in Peewee ORM"
DESCRIPTION = "A simple migration engine for Peewee_ ORM"
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python314-peewee-migrate-1.15.0-1.2.noarch.rpm"
RPM_HASH = "316001f440fdba7cb73adf5b92403f3050b02548ebbf8ccec6a6bfc4e226989cc9d67c5bf51cab5f94ab3badd73ffe651cea08eb27f6ea060395cd429d775c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-peewee-migrate \
python314-peewee-migrate \
python3dist-peewee-migrate"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314 \
python314-click \
python314-peewee \
update-alternatives"

inherit rpm
