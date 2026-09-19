SUMMARY = "Django authentication, registration, account management"
DESCRIPTION = "Integrated set of Django applications addressing authentication, registration, \
account management as well as 3rd party (social) account authentication."
LICENSE = "MIT"

PV = "65.19.1"

RPM_NAME = "python314-django-allauth-65.19.1-1.1.noarch.rpm"
RPM_HASH = "cb8ff30c1e494b32c3017c3e860df76a92c719465beb36cdd5a4f0a5829fa1f0ae33a3028c143955afb4cf6dcb69d3b215e83e3577048310467aaa80a2376f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-allauth \
python314-django-allauth \
python3dist-django-allauth"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-asgiref"

inherit rpm
