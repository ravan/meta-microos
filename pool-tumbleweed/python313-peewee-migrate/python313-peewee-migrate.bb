SUMMARY = "Support for migrations in Peewee ORM"
DESCRIPTION = "A simple migration engine for Peewee_ ORM"
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python313-peewee-migrate-1.15.0-1.2.noarch.rpm"
RPM_HASH = "94f8cc9ff464eee244657a0276cc8efaf23430d1e1ada209bc5b5d3bd9fe161e8c815983e2751bc8c622ab1ae07bced85cfd200b8e6beab0f40abe8118cd1c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-peewee-migrate \
python3.13dist-peewee-migrate \
python313-peewee-migrate \
python3dist-peewee-migrate"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313 \
python313-click \
python313-peewee \
update-alternatives"

inherit rpm
