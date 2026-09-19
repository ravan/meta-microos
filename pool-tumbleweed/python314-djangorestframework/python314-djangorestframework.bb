SUMMARY = "A REST Framework for Django"
DESCRIPTION = "Django REST framework is a library for building Web APIs. It is \
modular and the architecture can be customized, based on Django's \
class based views. \
 \
Web APIs built using REST framework are fully self-describing and web \
browseable. It also supports a wide range of media types, \
authentication and permission policies out of the box."
LICENSE = "BSD-2-Clause"

PV = "3.18.0"

RPM_NAME = "python314-djangorestframework-3.18.0-2.1.noarch.rpm"
RPM_HASH = "3bedc4d129c3b8acaa9c555123353532ec0e7b7fac0671a1ce1eb18e312ddafe046efb628dab083b1ba8064baad3804e0cce7c4525048d6de1842b12fce2db41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-djangorestframework \
python314-django-rest-framework \
python314-djangorestframework \
python3dist-djangorestframework"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
