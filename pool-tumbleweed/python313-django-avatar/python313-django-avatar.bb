SUMMARY = "Django-avatar package"
DESCRIPTION = "Django-avatar is a reusable application for handling user avatars.  It has the \
ability to default to Gravatar_ if no avatar is found for a certain user. \
Django-avatar automatically generates thumbnails and stores them to your default \
file storage backend for retrieval later."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python313-django-avatar-9.0.0-1.4.noarch.rpm"
RPM_HASH = "903c6baf0990d347c38d6b14c1d3f19a05bcda1b06da713a3ebcef9498e055865666bdc5e357af294e81123ab1facb62f8ee64c2904a50e3f81237a3a523433b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-avatar \
python3.13dist-django-avatar \
python313-django-avatar \
python3dist-django-avatar"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-Pillow \
python313-django-appconf \
python313-dnspython"

inherit rpm
