SUMMARY = "WTForms integration for peewee models"
DESCRIPTION = "wtf-peewee provides a bridge between peewee models and wtforms, mapping \
model fields to form fields."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-wtf-peewee-3.1.0-1.2.noarch.rpm"
RPM_HASH = "4f93f124d5b067c9ec5a230b64f19b5476e6291ae96d0794154540e50c80b5ecd54d75451bfb92c11604148008c43371e322ea27ae00f550f7cda8056f2f9908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wtf-peewee \
python314-wtf-peewee \
python3dist-wtf-peewee"

RDEPENDS:${PN} += "python-abi \
python314-WTForms \
python314-peewee"

inherit rpm
