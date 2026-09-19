SUMMARY = "Django allauth - Third-party ('social') accounts"
DESCRIPTION = "Python extra dependency `socialaccount` for python-django-allauth."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python313-django-allauth-socialaccount-65.19.1-1.1.noarch.rpm"
RPM_HASH = "af11a495f64c54de1952d33c23d50f39634da3f35600f1f8f11ca8c2d98b19c7fe842192fa196ddf2dc7beead66e4e889ae47a6fff9ae38bca0996c037de42bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth-socialaccount \
python313-django-allauth-socialaccount"

RDEPENDS:${PN} += "python313-PyJWT \
python313-cryptography \
python313-django-allauth \
python313-oauthlib \
python313-requests"

inherit rpm
