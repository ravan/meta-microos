SUMMARY = "Django library to help interaction with Mailman"
DESCRIPTION = "Django library to help interaction with Mailman."
LICENSE = "GPL-3.0-only"

PV = "1.3.14"

RPM_NAME = "python313-django-mailman3-1.3.14-4.3.noarch.rpm"
RPM_HASH = "c98de2aad10fb39622b5a4e961b8abf0f2b29f3055969bc4431f143178d4cc62d20bae4957078c2ead6ade65810cfd93961eb6a82b7b7367e67118e67d06d252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mailman3 \
python3.13dist-django-mailman3 \
python313-django-mailman3 \
python3dist-django-mailman3"

RDEPENDS:${PN} += "-python313-Django >= 4.2 with python313-Django < 5.3 \
python-abi \
python313-PyJWT \
python313-django-allauth \
python313-django-gravatar2 \
python313-mailmanclient \
python313-oauthlib \
python313-python3-openid \
python313-requests"

inherit rpm
