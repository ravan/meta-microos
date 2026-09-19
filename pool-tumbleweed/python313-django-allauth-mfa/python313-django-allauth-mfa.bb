SUMMARY = "Django allauth - Two-Factor Authentication"
DESCRIPTION = "Python extra dependency `mfa` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python313-django-allauth-mfa-65.19.1-1.1.noarch.rpm"
RPM_HASH = "436dc8993622d0bf6e15eaa856e1a125dafda38f4ff637400a4a7b4e9c5af72e35b51c1e8c4d89fd46b7bb508dae4c17f3aed181290c82332ecd4028f946cb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth-mfa \
python313-django-allauth-mfa"

RDEPENDS:${PN} += "python313-django-allauth \
python313-fido2 \
python313-qrcode"

inherit rpm
