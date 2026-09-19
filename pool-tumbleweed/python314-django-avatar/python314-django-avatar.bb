SUMMARY = "Django-avatar package"
DESCRIPTION = "Django-avatar is a reusable application for handling user avatars.  It has the \
ability to default to Gravatar_ if no avatar is found for a certain user. \
Django-avatar automatically generates thumbnails and stores them to your default \
file storage backend for retrieval later."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python314-django-avatar-9.0.0-1.4.noarch.rpm"
RPM_HASH = "68fb4a1f4b5a008f5feecfcabfd2df3a091d127881cf14aeb4773f8f0d60fb6096d519800b776184cba6ac32eb63f994fbb83084539952022d4f4c4d8527ea04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-avatar \
python314-django-avatar \
python3dist-django-avatar"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-Pillow \
python314-django-appconf \
python314-dnspython"

inherit rpm
