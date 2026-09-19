SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python313-django-allauth-65.19.1-1.1.noarch.rpm"
RPM_HASH = "0a2eb9a41e97afdabb10627bd9797808d43ce94e05ce3e4b5f7fc1f7dd4908b4033ff9cc52dbb6dbf699e119a3efdbd72898e8b5676e6ab3960d6d6c2354ae7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-allauth \
python3.13dist-django-allauth \
python313-django-allauth \
python3dist-django-allauth"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-asgiref"

inherit rpm
