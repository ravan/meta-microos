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

RPM_NAME = "python313-djangorestframework-3.18.0-2.1.noarch.rpm"
RPM_HASH = "2d8c74252d9ea0ee6766bd12d485fee522ab04096dd8a08f16a1f7b67f610e1f571777b6ef1607e548a746997fb50c6df3fad8777fe0136bf00d7e91acc319cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rest-framework \
python3-djangorestframework \
python3.13dist-djangorestframework \
python313-django-rest-framework \
python313-djangorestframework \
python3dist-djangorestframework"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
