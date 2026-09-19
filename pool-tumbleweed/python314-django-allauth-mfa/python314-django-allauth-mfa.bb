SUMMARY = "Django allauth - Two-Factor Authentication"
DESCRIPTION = "Python extra dependency `mfa` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python314-django-allauth-mfa-65.19.1-1.1.noarch.rpm"
RPM_HASH = "43d454d50887fe473c9bc3c6dd8174fa8151ed9114d6e738dd91d97bb317f83fc4c84707656a5916ef02270c5205c4443517aff0ace6fc733a3382b8833083b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-django-allauth-mfa"

RDEPENDS:${PN} += "python314-django-allauth \
python314-fido2 \
python314-qrcode"

inherit rpm
