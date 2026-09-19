SUMMARY = "Django allauth - Third-party ('social') accounts"
DESCRIPTION = "Python extra dependency `socialaccount` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python314-django-allauth-socialaccount-65.19.1-1.1.noarch.rpm"
RPM_HASH = "24da7d41769851cfbc08554a958f09c0b12f4d4cd083eaea5550f3bfde1c4bcc1b0ca08c3734d2c630efe4b2df8dbfb6dec3de69c10fe47e8abce4b864024c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-django-allauth-socialaccount"

RDEPENDS:${PN} += "python314-PyJWT \
python314-cryptography \
python314-django-allauth \
python314-oauthlib \
python314-requests"

inherit rpm
