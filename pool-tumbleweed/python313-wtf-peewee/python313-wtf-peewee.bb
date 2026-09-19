SUMMARY = "WTForms integration for peewee models"
DESCRIPTION = "wtf-peewee provides a bridge between peewee models and wtforms, mapping \
model fields to form fields."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-wtf-peewee-3.1.0-1.2.noarch.rpm"
RPM_HASH = "06d5f583d982e99e1d03c029eb9e8f937ca9e1b4dd9702fbdb5e0bbd68c6876ca8aa4691c43206051067ec20d77e76e39868d9ea31276897eedfcd19e936d621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wtf-peewee \
python3.13dist-wtf-peewee \
python313-wtf-peewee \
python3dist-wtf-peewee"

RDEPENDS:${PN} += "python-abi \
python313-WTForms \
python313-peewee"

inherit rpm
